package arrays;

import org.junit.Assert;
import org.junit.Test;

public class OddOccurrencesInArrayTest {

    @Test
    public void basicTest() {
        int[] A = {9, 3, 9, 3, 9, 7, 9};
        Assert.assertEquals(7, OddOccurrencesInArray.solution(A));
    }
}
