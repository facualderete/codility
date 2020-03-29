package arrays;

import org.junit.Assert;
import org.junit.Test;

public class CyclicRotationTest {

    @Test
    public void test() {
        int[] A = {3, 8, 9, 7, 6};
        int[] B = {1, 2, 3, 4};
        int[] expectedResultA = {9, 7, 6, 3, 8};
        int[] expectedResultB = {1, 2, 3, 4};

        int[] resultA = CyclicRotation.solution(A, 3);
        int[] resultB = CyclicRotation.solution(B, 4);

        assertArrayValues(resultA, expectedResultA);
        assertArrayValues(resultB, expectedResultB);
    }

    private void assertArrayValues(int[] values, int[] expectedValues) {
        Assert.assertEquals("Asserting array and expected array should have the same length",
                values.length, expectedValues.length);
        for (int i = 0 ; i < values.length ; i++) {
            Assert.assertEquals(String.format("Value is different than expected on index %d", i),
                    values[i], expectedValues[i]);
        }
    }
}
