package prefixsums;

import org.junit.Test;

import static utils.ArrayComparator.assertArrayValues;

public class GenomicRangeQueryTest {

    @Test
    public void basicTest() {
        String S = "CAGCCTA";
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        int[] expectedResult = {2, 4, 1};
        int [] response = GenomicRangeQuery.solution(S, P, Q);
        assertArrayValues(response, expectedResult);
    }
}
