package prefixsums;

import java.util.HashMap;
import java.util.Map;

public class GenomicRangeQuery {

    private static final Map<Character, Integer> impactFactor = new HashMap<>();

    static {
        impactFactor.put('A', 1);
        impactFactor.put('C', 2);
        impactFactor.put('G', 3);
        impactFactor.put('T', 4);
    }

    public static int[] solution(String S, int[] P, int[] Q) {
        int inputLength = S.length();
        int M = P.length;
        int[] result = new int[M];

        int[][] prefixes = new int[inputLength][4];

        for (int i = 0 ; i < inputLength ; i++) {
            prefixes[i][impactFactor.get(S.charAt(i)) - 1] = 1;
        }

        for (int i = 1 ; i < inputLength ; i++) {
            for (int j = 0 ; j < 4 ; j++) {
                prefixes[i][j] += prefixes[i - 1][j];
            }
        }

        for (int i = 0 ; i < M ; i++) {
            int lowerBound = P[i];
            int upperBound = Q[i];

            for (int nucleotide = 0 ; nucleotide < 4 ; nucleotide++) {
                int impactFloor = 0;
                if (lowerBound - 1 >= 0) {
                    impactFloor = prefixes[lowerBound - 1][nucleotide];
                }
                if (prefixes[upperBound][nucleotide] > impactFloor) {
                    result[i] = nucleotide + 1;
                    break;
                }

            }
        }
        return result;
    }
}