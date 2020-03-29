package countingelements;

import org.junit.Assert;
import org.junit.Test;

public class MissingIntegerTest {

    @Test
    public void basicTest() {
        int[] A = {1, 3, 6, 4, 1, 2};
        int[] B = {1, 2, 3};
        int[] C = {-1, -3};

        Assert.assertEquals(5, MissingInteger.solutionA(A));
        Assert.assertEquals(4, MissingInteger.solutionA(B));
        Assert.assertEquals(1, MissingInteger.solutionA(C));

        Assert.assertEquals(5, MissingInteger.solutionB(A));
        Assert.assertEquals(4, MissingInteger.solutionB(B));
        Assert.assertEquals(1, MissingInteger.solutionB(C));
    }
}
