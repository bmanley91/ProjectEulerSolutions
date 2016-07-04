package Problem5;


/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10
 * without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers
 * from 1 to 20?
 */
public class SmallestMultiple {
    private static final int INPUT = 20;

    public static void main(String args[]) {
        System.out.print(getLeastCommonMultipleUnderValue(INPUT));
    }

    /** MATH!
     *
     *  LCM = Least Common Multiple, GCD = Greatest Common Denominator
     *  LCM(1 to n) = (LCM(1 to n-1) * n) / (GCD(LCM(1 to n-1), n))
     *
     **/

    static int getLeastCommonMultipleUnderValue(int input) {
        int multiple = 1;

        for (int i = 2; i <= input; i++) {
            multiple *= i / getGreatestCommonDenominator(i, multiple);
        }

        return multiple;
    }

    static int getGreatestCommonDenominator(int input1, int input2) {
        while (input2 != 0) {
            int temp = input1;
            input1 = input2;
            input2 = temp % input2;
        }

        return input1;
    }
}
