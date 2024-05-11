/*
Write a program that reads from the console a sequence of n integer numbers and prints these numbers with the correct sign between them.

Input
On the first line, you will receive the number N
On each of the next N lines, you will receive a number
Output
Print on a single line with "<", ">" or "=" between the numbers.
Constraints
1 <= N <= 1000
*/
import java.util.Scanner;

public class Pack4Task2SmallerGreaterOrEqual {
    public static void main(String[] args) {
        // The scanner is used to read input
        Scanner scanner = new Scanner(System.in);

        // Get the numbersAmount
        int numbersAmount = scanner.nextInt();

        // Get the firstNumber
        int firstNumber = scanner.nextInt();

        //Print the first number
        System.out.print(firstNumber);


        // Create a loop to go over the next numbers (numbersAmount - 1) because the first number is already printed
        for (int i = 0; i < numbersAmount - 1; i++) {

            // Read the next input and parse it to int
            int number = scanner.nextInt();

            if (number > firstNumber) {
                System.out.print("<");
            } else if (number < firstNumber) {
                System.out.print(">");
            } else {
                System.out.print("=");
            }

            System.out.print(number);
            firstNumber = number;

        }
    }
}
