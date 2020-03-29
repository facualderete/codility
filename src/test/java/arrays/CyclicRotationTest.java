package arrays;

import org.junit.Test;

import static utils.ArrayComparator.assertArrayValues;

public class CyclicRotationTest {

    @Test
    public void basicTest() {
        int[] A = {3, 8, 9, 7, 6};
        int[] B = {1, 2, 3, 4};
        int[] expectedResultA = {9, 7, 6, 3, 8};
        int[] expectedResultB = {1, 2, 3, 4};

        int[] resultA = CyclicRotation.solution(A, 3);
        int[] resultB = CyclicRotation.solution(B, 4);

        assertArrayValues(resultA, expectedResultA);
        assertArrayValues(resultB, expectedResultB);
    }
}
