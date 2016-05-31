package Problem1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by bmanley on 5/27/16.
 */
@SuppressWarnings("Duplicates")
public class MultiplesOf3Or5Test {

    private static final List<Integer> TEST_INTEGER_LIST = new ArrayList<Integer>() {{
        add(3);
        add(5);
        add(6);
        add(9);}};

    @Test
    public void testFindMultiplesUnderMax() {
        final int maxValue = 10;

        List<Integer> actualResults = MultiplesOf3Or5.findMultiplesUnderMax(maxValue);

        assertEquals("Expected list not returned.", TEST_INTEGER_LIST, actualResults);
    }

    @Test
    public void testIsMultipleOf3() {
        final int multipleOf3 = 6;

        assertTrue("Multiple of 3 returned false.", MultiplesOf3Or5.isMultipleOf3(multipleOf3));
    }

    @Test
    public void testIsNotMultipleOf3() {
        final int notMultipleOf3 = 7;

        assertFalse("Non-multiple of 3 returned true.", MultiplesOf3Or5.isMultipleOf3(notMultipleOf3));
    }

    @Test
    public void testIsMultipleOf5() {
        final int multipleOf5 = 10;

        assertTrue("Multiple of 5 returned false.", MultiplesOf3Or5.isMultipleOf5(multipleOf5));
    }

    @Test
    public void testIsNotMultipleOf5() {
        final int notMultipleOf5 = 11;

        assertFalse("Non-multiple of 5 returned true.", MultiplesOf3Or5.isMultipleOf5(notMultipleOf5));
    }

    @Test
    public void testSumList() {
        final int expectedTotal = 23;

        assertEquals("Sum total did not match expected amount.", expectedTotal, MultiplesOf3Or5.sumList(TEST_INTEGER_LIST));
    }
}
