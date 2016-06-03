package Problem3;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class HighestPrimeFactorTest {

    @Test
    public void testGetFactors() {
        final long input = 8L;
        final List<Long> expectedResult = new ArrayList<Long>();
        expectedResult.add(1L);
        expectedResult.add(2L);
        expectedResult.add(4L);
        expectedResult.add(8L);

        assertEquals("Result did not match expected value.", expectedResult, HighestPrimeFactor.getFactors(input));
    }

    @Test
    public void testGetPrimes() {
        final List<Long> input = new ArrayList<Long>();
        input.add(3L);
        input.add(4L);
        input.add(5L);

        final List<Long> expectedResults = new ArrayList<Long>();
        input.add(3L);
        input.add(4L);
        input.add(5L);

        assertEquals("Results did not match expected values.", expectedResults, HighestPrimeFactor.getPrimes(input));
    }

    @Test
    public void testIsPrime() {
        final Long notPrime = 8L;
        final Long prime = 3L;

        assertTrue("Prime input returned false", HighestPrimeFactor.isPrime(prime));
        assertFalse("Non-prime input returned true", HighestPrimeFactor.isPrime(notPrime));
    }
}
