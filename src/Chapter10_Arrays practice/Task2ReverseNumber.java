/*

Description
Write a method that reverses the digits of a given decimal number.

Input
On the first line you will receive a number

Output
Print the given number with reversed digits

 */

import java.util.Scanner;

public class Task2ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reads the input and directly filling a character array
        char[] number = scanner.next().toCharArray();


        // Iterating in reverse order
        for (int i = number.length - 1; i >= 0; i--) {
            // Printing the current character without going on a new line
            System.out.print(number[i]);
        }
    }
}
