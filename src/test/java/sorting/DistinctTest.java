package sorting;

import org.junit.Assert;
import org.junit.Test;

public class DistinctTest {

    @Test
    public void basicTest() {
        int[] A = {2, 1, 1, 2, 3, 1};
        Assert.assertEquals(3, Distinct.solution(A));
    }
}