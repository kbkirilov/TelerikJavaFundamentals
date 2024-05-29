/*
Balanced Numbers
A balanced numberAsString is a 3-digit numberAsString whose second digit is equal to the sum of the first and last digit.

Write a program which reads and sums balanced numbers. You should stop when an unbalanced numberAsString is given.

Input
Input data is read from the standard input

Numbers will be given
Each one will be on a separate line
Output
Print to the standard output

Constraints
No more than 1000 numbers will be given

 */

import java.util.Scanner;

public class MockExams1Task3BalancedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;

        while (true) {
            int input = scanner.nextInt();
            int first = input / 100;
            int middle = (input / 10) % 10;
            int last = input % 10;

            if (middle != first + last) {
                break;
            } else {
                result += input;
            }

        }

        System.out.println();

    }
}
