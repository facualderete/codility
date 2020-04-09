package prefixsums;

public class MinAvgTwoSlice {

    public static int solution(int[] A) {
        double minSlice = Double.MAX_VALUE;
        int minIndexSlice = Integer.MAX_VALUE;
        double sum;
        double divisor;
        double slice;

        for (int P = 0 ; P < A.length - 1 ; P++) {
            sum = A[P];
            for (int Q = P + 1 ; Q < A.length ; Q++) {
                sum += A[Q];
                divisor = Q - P + 1;
                slice = sum / divisor;

                if (slice < minSlice) {
                    minSlice = slice;
                    minIndexSlice = P;
                } else if (slice == minSlice && P < minIndexSlice) {
                    minIndexSlice = P;
                }
            }
        }
        return minIndexSlice;
    }
}
