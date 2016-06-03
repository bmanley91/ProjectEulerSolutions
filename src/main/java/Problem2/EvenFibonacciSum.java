package Problem2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bmanley on 5/27/16.
 */
public class EvenFibonacciSum {
    private static final int MAX_VALUE = 4000000;

    public static void main(String args[]) {

        List<Integer> fibonacciNumbers = getFibonacciNumbersUnderMax(MAX_VALUE, null);

        List<Integer> evenFibonacciNumbers = getEvenNumbers(fibonacciNumbers);

        int sum = sumNumbers(evenFibonacciNumbers);

        System.out.println(sum);
    }

    static List<Integer> getFibonacciNumbersUnderMax(int maxValue, List<Integer> currentList) {
        if (currentList == null) {
            currentList = new ArrayList<Integer>();
            currentList.add(1);
            currentList.add(1);
        }

        final int lastNumber = currentList.size() - 1;
        final int secondToLasNumber = currentList.size() - 2;

        int value1 = currentList.get(lastNumber);
        int value2 = currentList.get(secondToLasNumber);

        int currentNumber = value1 + value2;

        if (currentNumber >= maxValue) {
            return currentList;

        } else {
            currentList.add(currentNumber);

            return getFibonacciNumbersUnderMax(maxValue, currentList);
        }
    }

    static List<Integer> getEvenNumbers(List<Integer> input) {
        List<Integer> returnValue = new ArrayList<Integer>();

        for (int currentNumber : input) {
            if (currentNumber % 2 == 0) {
                returnValue.add(currentNumber);
            }
        }

        return returnValue;
    }

    static int sumNumbers(List<Integer> inputList) {
        int result = 0;

        for (int currentNumber : inputList) {
            result += currentNumber;
        }

        return result;
    }
}
