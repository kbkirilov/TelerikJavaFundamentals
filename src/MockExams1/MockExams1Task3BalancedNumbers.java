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

        int digit1 = 0;
        int digit2 = 0;
        int digit3 = 0;

        int sum = 0;

        int sumDigits = 0;


        while (true) {
            // Reads the numberAsString
            String numberAsString = scanner.nextLine();

            boolean isBalanced = true;
            
            int number = Integer.parseInt(String.valueOf(numberAsString));

            digit1 = Integer.parseInt(String.valueOf(numberAsString.charAt(0)));
            digit2 = Integer.parseInt(String.valueOf(numberAsString.charAt(1)));
            digit3 = Integer.parseInt(String.valueOf(numberAsString.charAt(2)));

            // Check if it is balanced or not
            if (digit2 == digit1 + digit3) {
                sum += number;
            } else {
                isBalanced = false;
                break;
            }

        }

        System.out.println(sum);

    }
}
