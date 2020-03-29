package countingelements;

import org.junit.Assert;
import org.junit.Test;

public class PermCheckTest {

    @Test
    public void basicTest() {
        int[] A = {4, 1, 3, 2};
        int[] B = {4, 1, 3};
        int[] C = {1, 4, 1};
        Assert.assertEquals(1, PermCheck.solution(A));
        Assert.assertEquals(0, PermCheck.solution(B));
        Assert.assertEquals(0, PermCheck.solution(C));
    }
}
