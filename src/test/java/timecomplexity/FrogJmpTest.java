package timecomplexity;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FrogJmpTest {

    @Test(dataProvider = "dataProvider")
    public void basicTest(int X, int Y, int D, int expectedResult) {
        assertThat(FrogJmp.solution(X, Y, D), is(expectedResult));
    }

    @DataProvider(name = "dataProvider")
    public Object[][] basicTestDataProvider() {
        return new Object[][] {
            {10, 85, 30, 3},
            {10, 10, 30, 0},
            {10, 5, 30, 0},
            {3, 999111321, 7, 142730189},
            {10, 70, 30, 2},
            {10, 70, 100, 1}
        };
    }
}