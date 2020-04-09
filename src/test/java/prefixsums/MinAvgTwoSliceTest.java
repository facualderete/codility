package prefixsums;

import org.junit.Assert;
import org.junit.Test;

public class MinAvgTwoSliceTest {

    @Test
    public void basicTest() {
        int[] A = {4, 2, 2, 5, 1, 5, 8};
        Assert.assertEquals(1, MinAvgTwoSlice.solution(A));
    }
}
