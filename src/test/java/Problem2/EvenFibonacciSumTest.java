package Problem2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by bmanley on 5/27/16.
 */
public class EvenFibonacciSumTest {

    private static final List<Integer> INPUT_LIST = new ArrayList<Integer>() {{
        add(1);
        add(2);
        add(3);
        add(4);}};

    @Test
    public void testGetFibonacciNumbersUnderMax() {
        final int maxValue = 8;

        final List<Integer> expectedResults = new ArrayList<Integer>();
        expectedResults.add(1);
        expectedResults.add(1);
        expectedResults.add(2);
        expectedResults.add(3);
        expectedResults.add(5);


        assertEquals("Results did not match expected list.", expectedResults,
                EvenFibonacciSum.getFibonacciNumbersUnderMax(maxValue, null));
    }

    @Test
    public void testGetEvenNumbers() {
        final List<Integer> expectedResults = new ArrayList<Integer>();
        expectedResults.add(2);
        expectedResults.add(4);

        assertEquals("Results did not match expected list.", expectedResults,
                EvenFibonacciSum.getEvenNumbers(INPUT_LIST));
    }

    @Test
    public void testSumNumbers() {
        final int expectedResult = 10;

        assertEquals("Result did not match expected value.", expectedResult, EvenFibonacciSum.sumNumbers(INPUT_LIST));
    }
}
