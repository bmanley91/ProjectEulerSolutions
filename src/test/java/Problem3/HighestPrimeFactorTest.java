package Problem3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HighestPrimeFactorTest {

    @Test
    public void testGetHighestPrimeFactor() {
        final long total = 8L;
        final long expectedValue = 4L;

        assertEquals("Result did not match expected value.", expectedValue, HighestPrimeFactor.getHighestPrimeFactor(total));
    }

    @Test
    public void testIsAFactorOf() {
        final long total = 500;
        final long notAFactor = 3;
        final long factor = 5;

        assertFalse(HighestPrimeFactor.isAFactorOf(notAFactor, total));
        assertTrue(HighestPrimeFactor.isAFactorOf(factor, total));
    }

    @Test
    public void testIsPrime() {
        final Long notPrime = 8L;
        final Long prime = 3L;

        assertTrue("Prime input returned false", HighestPrimeFactor.isPrime(prime));
        assertFalse("Non-prime input returned true", HighestPrimeFactor.isPrime(notPrime));
    }
}
