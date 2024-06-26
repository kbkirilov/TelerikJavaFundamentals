/*
Crooked Digits
The crooked digit of a given number N is calculated using the number's digits in a very weird and bendy algorithm. The algorithm takes the following steps:

Sums the digits of the number N and stores the crookedDigit back in N.
If the obtained crookedDigit is bigger than 9, step 1. is repeated, otherwise the algorithm finishes.
The last obtained value of N is the crookedDigit, calculated by the algorithm.

Input
The inputNString data should be read from the console.
The only line in the inputNString contains a number N, which can be an integer or real number (decimal fraction), positive or negative.
The inputNString data will always be valid and in the format described. There is no need to check it explicitly.
Output
The output data should be printed on the console.

You must print the calculated crooked digit of the number N on the first and only line of the output.

Constraints
The number N will have no more than 300 digits before and after the decimal point.
The decimal separator will always be the "." symbol.

 */

import java.util.Scanner;

public class MockExams1Task1CrookedDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();

        int result = Integer.MAX_VALUE;

        while (result > 9) {

            result = 0;

            for (int i = 0; i < n.length(); i++) {

                if (n.charAt(i) == '-') {
                    continue;
                } else if (n.charAt(i) == '.') {
                    continue;
                } else {
                    int currNumInN = Integer.parseInt(String.valueOf(n.charAt(i)));

                    result += currNumInN;
                }
            }
            n = String.valueOf(result);
        }


        System.out.println(result);
    }
}