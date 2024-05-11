/*
Write a program that reads two integer numbers from the console and prints the greater of them. Try to implement this without if statements.

Input
Read from the standard input

Exactly 2 numbers. Each number will be on a separate line.
Output
Print on the standard output

Constraints
The input numbers will always be valid integer numbers. You do not have to explicitly check if they are valid.
*/
import java.util.Scanner;

public class Pack3Task3NumberComparer {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int numberOne = userInput.nextInt();
        int numberTwo = userInput.nextInt();

        int result = Math.max(numberOne, numberTwo);

        System.out.println(result);
    }

}
