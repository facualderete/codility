package stacksandqueues;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StoneWallTest {

    @Test(dataProvider = "dataProvider")
    public void basicTest(int[] H, int expectedResult) {
        assertThat(StoneWall.solution(H), is(expectedResult));
    }

    @DataProvider(name = "dataProvider")
    public Object[][] basicTestDataProvider() {
        return new Object[][] {
                {new int[]{8, 8, 5, 7, 9, 8, 7, 4, 8}, 7}
        };
    }
}
