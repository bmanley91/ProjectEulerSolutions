package Problem1;

import java.util.ArrayList;
import java.util.List;

/**
 * Get the sum of all multiples of 3 or 5 under 1000.
 */
public class MultiplesOf3Or5 {

    private static final int MAX_VALUE = 1000;

    public static void main(String args[]) {
        List<Integer> multiples = findMultiplesUnderMax(MAX_VALUE);

        System.out.println(sumList(multiples));
    }

    static List<Integer> findMultiplesUnderMax(int maxValue) {
        List<Integer> returnList = new ArrayList<Integer>();

        for (int i = 1; i < maxValue; i++) {
            if (isMultipleOf3(i) || isMultipleOf5(i)) {
                returnList.add(i);
            }
        }

        return returnList;
    }

    static boolean isMultipleOf3(int value) {
        return value % 3 == 0;
    }

    static boolean isMultipleOf5(int value) {
        return value % 5 == 0;
    }

    static int sumList(List<Integer> integerList) {
        int returnVal = 0;

        for(int currentInt : integerList) {
            returnVal += currentInt;
        }

        return returnVal;
    }
}
