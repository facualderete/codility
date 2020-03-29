package utils;

import org.junit.Assert;

public class ArrayComparator {

    public static void assertArrayValues(int[] values, int[] expectedValues) {
        Assert.assertEquals("Asserting array and expected array should have the same length",
                values.length, expectedValues.length);
        for (int i = 0 ; i < values.length ; i++) {
            Assert.assertEquals(String.format("Value is different than expected on index %d", i),
                    values[i], expectedValues[i]);
        }
    }
}
