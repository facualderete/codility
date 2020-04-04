package prefixsums;

import org.junit.Assert;
import org.junit.Test;

public class PassingCarsTest {

    @Test
    public void basicTest() {
        int[] A = {0, 1, 0, 1, 1};
        Assert.assertEquals(5, PassingCars.solution(A));
    }
}
