package Problem3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HighestPrimeFactorTest {

    @Test
    public void testGetHighestPrimeFactor() {
        final long total = 15L;
        final long expectedValue = 5L;

        assertEquals("Result did not match expected value.", expectedValue, HighestPrimeFactor.getHighestPrimeFactor(total));
    }
}
