/*
Write a program that reads from the console a positive integer number N and prints a matrix like in the examples below. Use two nested loops.

Input
The input will always consist of a single line, which contains the number N
*/
import java.util.Scanner;

public class Pack3Task2MatrixNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int x = 1;

        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < rows ; j++) {
                System.out.print(i + j + 1 + " ");
            }
            System.out.println("");
        }

    }
}
