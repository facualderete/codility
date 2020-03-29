package countingelements;

import java.util.Set;
import java.util.TreeSet;

/**
 * Write a function:
 *
 * class Solution { public int solution(int[] A); }
 *
 * that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
 *
 * For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 *
 * Given A = [1, 2, 3], the function should return 4.
 *
 * Given A = [−1, −3], the function should return 1.
 *
 * Write an efficient algorithm for the following assumptions:
 *
 * N is an integer within the range [1..100,000];
 * each element of array A is an integer within the range [−1,000,000..1,000,000].
 */
public class MissingInteger {

    /**
     * Doesn't rely con other Java libraries.
     * It's completely dependent con the problem's initial conditions.
     * It's memory inefficient due to large array.
     * Gets 100% score.
     */
    public static int solutionA(int[] A) {
        int[] occurrences = new int[1000000];
        for (int value : A) {
            if (value > 0) {
                occurrences[value - 1]++;
            }
        }
        int i = 0;
        while (i < occurrences.length) {
            if (occurrences[i] == 0) {
                return i + 1;
            }
            i++;
        }
        return i + 1;
    }

    /**
     * Seems to be more memory efficient, but doesn't get 100% score due to timeouts on large sets.
     */
    public static int solutionB(int[] A) {
        Set<Integer> inputSet = new TreeSet<>();
        Set<Integer> controlSet = new TreeSet<>();

        for (int i = 0 ; i < A.length ; i++) {
            inputSet.add(A[i]);
            controlSet.add(i + 1);
        }

        for (int controlValue : controlSet) {
            if (!inputSet.contains(controlValue)) {
                return controlValue;
            }
        }

        if (inputSet.size() == controlSet.size()) {
            return controlSet.size() + 1;
        }

        return 1;
    }

}
