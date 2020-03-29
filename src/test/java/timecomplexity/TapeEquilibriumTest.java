package timecomplexity;

import org.junit.Assert;
import org.junit.Test;

public class TapeEquilibriumTest {

    @Test
    public void basicTest() {
        int[] A = {3, 1, 2, 4, 3};
        Assert.assertEquals(1, TapeEquilibrium.solution(A));
    }
}
