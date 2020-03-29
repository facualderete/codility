package timecomplexity;

import org.junit.Assert;
import org.junit.Test;

public class PermMissingElemTest {

    @Test
    public void basicTest() {
        int[] A = {2, 3, 1, 5};
        int[] B = {2, 3, 4, 5};
        int[] C = {2, 3, 4, 1};
        int[] D = {2, 1, 4, 5};
        int[] E = {3, 1, 4, 5};

        Assert.assertEquals(4, PermMissingElem.solution(A));
        Assert.assertEquals(1, PermMissingElem.solution(B));
        Assert.assertEquals(5, PermMissingElem.solution(C));
        Assert.assertEquals(3, PermMissingElem.solution(D));
        Assert.assertEquals(2, PermMissingElem.solution(E));
    }
}
