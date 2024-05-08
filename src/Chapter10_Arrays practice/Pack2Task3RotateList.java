/*
Write a program that rotates a numbers several times (the first element becomes last).

numbers = 1,2,3,4,5 and N = 2 -> result = 3,4,5,1,2
Note that N could be larger than the length of the numbers.

numbers = 1,2,3,4,5 and N = 6 -> result = 2,3,4,5,1

Input
On the first line you will receive the numbers of numbers.
On the second line you will receive N

Output
On the only line of output, print the numbers separated by a comma.
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pack2Task3RotateList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the numbers and splitting them in a String array
        String[] numbers = scanner.nextLine().split(",");

        
        // Get the numberOfRotates as int
        int numberOfRotates = Integer.parseInt(scanner.nextLine());


        // Store the length in a variable "size" - we need to use it several times
        // 'size' is shorter than 'numbers.length' for reading and writing
        int size = numbers.length;


        // Loop from 0 to numberOfRotates
        for (int i = 0; i < numberOfRotates; i++) {
            // Save the first number in firstNum - it will go at the end later
            String firstNum = numbers[0];

            // Create nested loop j from 0 to size - 1
            for (int j = 0; j < size - 1; j++) {
                // Move each next number (j + 1)
                // to the place of the current (j)
                numbers[j] = numbers[j + 1];
            }

            // Set the last element in the array to be firstNum
            numbers[size - 1] = firstNum;
        }


        // Output using String.join(",", numbers)
        System.out.println(String.join(",", numbers));
    }
}
