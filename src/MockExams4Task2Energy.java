/*
Energy drink calculations are simple - in order to decide how many drinks you should have, you are given a numberAsString. Find the sum of the even digits and the sum of the odd digits of that numberAsString, then compare these sums and:

If the sum of the even digits is bigger, drink energy drinks.
If the sum of the odd digits is bigger, drink cups of coffee.
If the two sums are equal, drink both.
Input
The input data is read from the standard input (the console).

The only input line contains the numberAsString N.
Output
The output data is printed on the standard output (the console).

The output consists of one line. You must print the kind of beverage you should drink, as well as the sum of digits that lead to that decision.
Note: The beverage is always in plural, no matter the numberAsString before it.

Constraints
That numberAsString can consist of up to 18 digits.
The digit zero (0) is considered to be even.

 */

import java.util.Scanner;

public class MockExams4Task2Energy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // The numberAsString I will make the calculations on
        String[] numberAsString = scanner.nextLine().split("");

        // the sum variables
        int sum_even = 0;
        int sum_odd = 0;


        int[] arrNumber = new int[numberAsString.length];
        
        for (int i = 0; i < arrNumber.length; i++) {
            arrNumber[i] = Integer.parseInt(numberAsString[i]);
            if (arrNumber[i] % 2 == 0 || arrNumber[i] == 0) {
                sum_even += arrNumber[i];
            } else {
                sum_odd += arrNumber[i];
            }
        }

        if (sum_even > sum_odd) {
            System.out.printf("%d energy drinks", sum_even);
        } else if (sum_even == sum_odd) {
            System.out.printf("%d of both", sum_even);
        } else {
            System.out.printf("%d cups of coffee", sum_odd);
        }
    }
}
