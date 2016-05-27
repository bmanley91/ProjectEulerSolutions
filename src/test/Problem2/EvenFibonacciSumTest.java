package Problem2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by bmanley on 5/27/16.
 */
public class EvenFibonacciSumTest {

    @Test
    public void testGetFibonacciNumbersUnderMax() {
        final int maxValue = 8;
        final List<Integer> expectedResults = new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(3);
            add(5);
        }};

        assertEquals("Results did not match expected list.", expectedResults,
                EvenFibonacciSum.getFibonacciNumbersUnderMax(maxValue));
    }
}
