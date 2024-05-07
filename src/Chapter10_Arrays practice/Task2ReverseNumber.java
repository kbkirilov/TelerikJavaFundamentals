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

        // Reads the number as string
        String numberStr = scanner.nextLine();


        // Splitting the string characters and filling the numberArr array with them
        String[] numberArr = numberStr.split("");


        // Declaring the flippedArr
        String[] flippedArr = new String[numberArr.length];


        // This will get the index of the element in the flippedArr array
        int index = 0;


        // Filling the flipped array
        for (int i = numberArr.length - 1; i >= 0 ; i--) {
            flippedArr[index] = numberArr[i];
            index++;
        }

        // Printing the flipped array values
        for (String s : flippedArr) {
            System.out.printf("%s", s);
        }
    }
}
