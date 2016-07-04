package Problem6;

import java.util.ArrayList;
import java.util.List;

/**
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class SumSquareDifference {
    private static final long MAX_NUMBER = 100L;


    public static void main(String args[]) {
        System.out.println(findSumSquareDifference(MAX_NUMBER));
    }

    static long findSumSquareDifference(long input) {
        return sumThenSquare(input) - squareThenSum(input);
    }

    static long sumThenSquare(long input) {
        long sumUnderInput = sumNumbersUnder(input);

        return square(sumUnderInput);
    }

    static long squareThenSum(long input) {
        List<Long> listOfSquares = new ArrayList<>();

        for (long i = 0; i <= input; i++) {
            listOfSquares.add(square(i));
        }

        return findSumOfList(listOfSquares);
    }

    static long findSumOfList(List<Long> inputList) {
        long returnVal = 0;

        for (long currentNumber : inputList) {
            returnVal += currentNumber;
        }

        return returnVal;
    }

    static long sumNumbersUnder(long input) {
        long returnVal = 0;

        for (long i = 1; i <= input; i++) {
            returnVal += i;
        }

        return returnVal;
    }

    static long square(long input) {
        return input * input;
    }
}