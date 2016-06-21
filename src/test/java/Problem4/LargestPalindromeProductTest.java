package Problem4;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LargestPalindromeProductTest {

    @Test
    public void testCheckProductsAboveValue() {
        final int expectedResult = 906609;

        assertEquals("Actual result did not match expected value.", expectedResult,
                LargestPalindromeProduct.checkProductsAboveValue());
    }

    @Test
    public void testIsPalindrome() {
        final int palindrome = 10001;
        final int notPalindrome = 12345;

        assertTrue("Palindrome did not return true.", LargestPalindromeProduct.isPalindrome(palindrome));
        assertFalse("Non-palindrome returned true.", LargestPalindromeProduct.isPalindrome(notPalindrome));
    }
}
