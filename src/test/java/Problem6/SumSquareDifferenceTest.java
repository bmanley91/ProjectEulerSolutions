package Problem6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by BrianManley on 7/4/16.
 */
public class SumSquareDifferenceTest {
    final static long INPUT = 10L;

    @Test
    public void testFindSumSquareDifference() {
        final long expectedResult = 2640L;

        assertEquals("Actual value did not match expected result.", expectedResult,
                SumSquareDifference.findSumSquareDifference(INPUT));
    }

    @Test
    public void testSumThenSquare() {
        final long expectedResult = 3025L;

        assertEquals("Actual value did not match expected result.", expectedResult,
                SumSquareDifference.sumThenSquare(INPUT));
    }

    @Test
    public void testSquareThenSum() {
        final long expectedResult = 385L;

        assertEquals("Actual value did not match expected result.", expectedResult,
                SumSquareDifference.sqareThenSum(INPUT));
    }

    @Test
    public void testSumNumbersUnder() {
        final long expectedResult = 55L;

        assertEquals("Actual value did not match expected result.", expectedResult,
                SumSquareDifference.sumNumbersUnder(INPUT));
    }

    @Test
    public void testSquare() {
        final long expectedResult = 100L;
        
        assertEquals("Actual value did not match expected result.",expectedResult, SumSquareDifference.square(INPUT));
    }
}
