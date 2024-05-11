/*
Write a program that reads 3 numbers (each number will be on a separate/new line), calculates and prints the sum of the greatest and smallest of them.

Input
Read from the standard input

Exactly 3 numbers. Each number will be on a separate line.
Output
Print on the standard output.
*/
import java.util.Scanner;

public class Pack4Task3SumOfGreatestAndSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number1 = Double.parseDouble(scanner.nextLine());
        double number2 = Double.parseDouble(scanner.nextLine());
        double number3 = Double.parseDouble(scanner.nextLine());

        double greatest = Math.max(number1, Math.max(number2, number3));
        double smallest = Math.min(number1, Math.min(number2, number3));

        System.out.printf("%.0f", greatest+smallest);

    }

}
