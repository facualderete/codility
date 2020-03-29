package timecomplexity;

import org.junit.Assert;
import org.junit.Test;

public class FrogJmpTest {

    @Test
    public void basicTest() {
        Assert.assertEquals(3, FrogJmp.solution(10, 85, 30));
        Assert.assertEquals(0, FrogJmp.solution(10, 10, 30));
        Assert.assertEquals(0, FrogJmp.solution(10, 5, 30));
        Assert.assertEquals(142730189, FrogJmp.solution(3, 999111321, 7));
        Assert.assertEquals(2, FrogJmp.solution(10, 70, 30));
        Assert.assertEquals(1, FrogJmp.solution(10, 70, 100));
    }
}