package Problem4;

/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 *
 *  Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class LargestPalindromeProduct {
    private static final int MAX_THREE_DIGIT_NUMBER = 999;
    private static final int MIN_THREE_DIGIT_NUMBER = 100;


    public static void main(String args[]) {
        System.out.println(checkProductsAboveValue());
    }

    @SuppressWarnings("PMD.CollapsibleIfStatements")
    static int checkProductsAboveValue() {
        int largestSoFar = 0;

        for (int x = MIN_THREE_DIGIT_NUMBER; x < MAX_THREE_DIGIT_NUMBER; x++) {
            for (int y = MIN_THREE_DIGIT_NUMBER; y < MAX_THREE_DIGIT_NUMBER; y++) {
                int testValue = x * y;

                // PMD Says to collapse this if statement. I disagree.
                if (largestSoFar < testValue) {
                    if (isPalindrome(testValue)) {
                        largestSoFar = testValue;
                    }
                }
            }
        }

        return largestSoFar;
    }

    static boolean isPalindrome(int input) {
        String reverse = new StringBuilder().append(input).reverse().toString();

        return reverse.equals(String.valueOf(input));
    }
}
