package Problem3;


/**
 *  The prime factors of 13195 are 5, 7, 13 and 29.
 *  What is the largest prime factor of the number 600851475143?
 */
public class HighestPrimeFactor {
    private static final long INPUT_VALUE = 600851475143L;

    public static void main(String args[]) {
        System.out.println("Result: " + getHighestPrimeFactor(INPUT_VALUE));
    }

    static long getHighestPrimeFactor(long input) {
        int currentNumber;

        for (currentNumber = 2; currentNumber <= input; currentNumber++) {
            if (input % currentNumber == 0) {
                input /= currentNumber;
                currentNumber--;
            }
        }

        return currentNumber;
    }
}
