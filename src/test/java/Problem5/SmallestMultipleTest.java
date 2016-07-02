package Problem5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmallestMultipleTest {

    @Test
    public void testGetLeastCommonMultipleUnderValue() {
        final int expectedResult = 2520;
        final int input = 10;

        assertEquals("Actual value did not match expected result.", expectedResult,
                SmallestMultiple.getLeastCommonMultipleUnderValue(input));
    }

    @Test
    public void testGetGreatestCommonDenominator() {
        final int expectedResult = 5;
        final int firstArg = 10;
        final int secondArg = 15;

        assertEquals("Actual value did not match expected result.", expectedResult,
                SmallestMultiple.getGreatestCommonDenominator(firstArg, secondArg));
    }
}
