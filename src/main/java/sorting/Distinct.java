package sorting;

import java.util.HashSet;
import java.util.Set;

public class Distinct {

    public static int solution(int[] A) {
        Set<Integer> distinct = new HashSet<>();
        for (int a : A) {
            distinct.add(a);
        }
        return distinct.size();
    }
}
