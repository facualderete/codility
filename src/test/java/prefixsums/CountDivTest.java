package prefixsums;

import org.junit.Assert;
import org.junit.Test;

public class CountDivTest {

    @Test
    public void basicTest() {
        Assert.assertEquals(3, CountDiv.solution(6, 11, 2));
        Assert.assertEquals(20, CountDiv.solution(11, 345, 17));
        Assert.assertEquals(1, CountDiv.solution(2, 2, 2));
        Assert.assertEquals(1, CountDiv.solution(0, 0, 2));
        Assert.assertEquals(2, CountDiv.solution(0, 2000000000, 2000000000));
    }
}
