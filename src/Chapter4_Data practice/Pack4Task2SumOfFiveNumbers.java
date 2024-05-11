/*
Write a program that enters 5 numbers (each number will be on a separate/new line), calculates and prints their sum.

Input
Read from the standard input

Exactly 5 numbers. Each number will be on a separate line.
Output
Print on the standard output
*/
import java.util.Scanner;

public class Pack4Task2SumOfFiveNumbers {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int numberA = userInput.nextInt();
        int numberB = userInput.nextInt();
        int numberC = userInput.nextInt();
        int numberD = userInput.nextInt();
        int numberE = userInput.nextInt();

        int sum = numberA + numberB + numberC + numberD + numberE;

        System.out.print(sum);


    }

}
