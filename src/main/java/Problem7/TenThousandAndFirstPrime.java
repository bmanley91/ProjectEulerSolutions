package Problem7;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 */
public class TenThousandAndFirstPrime {
    private static final int INPUT = 10001;

    public static void main(String args[]) {
        System.out.println(findNthPrimeNumber(INPUT));
    }

    /**
     * Implementation of Sieve of Eratosthenes (https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes)
     */
    static int findNthPrimeNumber(int input) {
        return 0;
    }
}
