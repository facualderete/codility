package timecomplexity;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PermMissingElemTest {

    @Test(dataProvider = "dataProvider")
    public void basicTest(int[] A, int expectedResult) {
        assertThat(PermMissingElem.solution(A), is(expectedResult));
    }

    @DataProvider(name = "dataProvider")
    public Object[][] basicTestDataProvider() {
        return new Object[][] {
            {new int[]{2, 3, 1, 5}, 4},
            {new int[]{2, 3, 4, 5}, 1},
            {new int[]{2, 3, 4, 1}, 5},
            {new int[]{2, 1, 4, 5}, 3},
            {new int[]{3, 1, 4, 5}, 2}
        };
    }
}
