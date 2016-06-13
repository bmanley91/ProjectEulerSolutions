package Problem4;

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 *  Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class LargestPalindromeProduct {


    public static void main(String args[]) {

    }

    static boolean isPalindrome(String input) {
        String reverse = new StringBuilder(input).reverse().toString();

        return reverse.equals(input);
    }
}
