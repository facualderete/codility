package countingelements;

import org.junit.Assert;
import org.junit.Test;

public class FrogRiverOneTest {

    @Test
    public void basicTest() {
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        Assert.assertEquals(6, FrogRiverOne.solution(5, A));
    }
}