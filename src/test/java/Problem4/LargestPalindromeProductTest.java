package Problem4;


import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LargestPalindromeProductTest {

    @Test
    public void testIsPalindrome() {
        final String palindrome = "10001";
        final String notPalindrome = "12345";

        assertTrue("Palindrome did not return true.", LargestPalindromeProduct.isPalindrome(palindrome));
        assertFalse("Non-palindrome returned true.", LargestPalindromeProduct.isPalindrome(notPalindrome));
    }
}
