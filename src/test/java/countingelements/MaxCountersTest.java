package countingelements;

import org.junit.Test;

import static utils.ArrayComparator.assertArrayValues;

public class MaxCountersTest {

    @Test
    public void basicTest() {
        int[] A = {3, 4, 4, 6, 1, 4, 4};
        int[] expectedResultA = {3, 2, 2, 4, 2};
        assertArrayValues(expectedResultA, MaxCounters.solution(5, A));
    }
}
