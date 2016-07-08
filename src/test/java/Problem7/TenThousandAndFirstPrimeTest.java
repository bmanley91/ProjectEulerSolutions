package Problem7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by bmanley on 7/8/16.
 */
public class TenThousandAndFirstPrimeTest {

    @Test
    public void testFindNthPrimeNumber() {
        final int input = 6;
        final int expectedResult = 13;

        assertEquals("Actual result did not match expected.", expectedResult,
                TenThousandAndFirstPrime.findNthPrimeNumber(input));
    }
}
