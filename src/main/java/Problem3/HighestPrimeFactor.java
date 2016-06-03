package Problem3;

import java.util.ArrayList;
import java.util.List;

/**
 *  The prime factors of 13195 are 5, 7, 13 and 29.
 *  What is the largest prime factor of the number 600851475143?
 */
public class HighestPrimeFactor {
    private static final long INPUT_VALUE = 600851475143L;

    public static void main(String args[]) {

    }

    static List<Long> getFactors(long input) {
        List<Long> resultList = new ArrayList<Long>();

        for (long i = 1L; i <= input; i++) {
            if (input % i == 0) {
                resultList.add(i);
            }
        }

        return resultList;
    }

    static List<Long> getPrimes(List<Long> inputList) {
        return inputList;
    }

    static boolean isPrime(Long input) {
        return false;
    }

}
