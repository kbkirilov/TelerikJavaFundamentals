/*
Repeating Numbers
Write a program that accepts an array of integers and returns the one that occurs the most times. If there are two numbers that occur the same amount of times, return the smaller of the two.

Input
Read from the standard input;
The number N is on the first line;
An integer between 1 and 10 is written on each of the next N lines;
The input data will always be valid and in the format described. There is no need to check it explicitly;
Output
Print to the standard output;
On the only output line you must print the number that occurs the most;
Constraints
The number N is a positive integer between 1 and 100 000, inclusive;
The list of numbers consists of positive integers between 1 and 10, inclusive;

 */


import java.util.ArrayList;
import java.util.Scanner;

public class MockExams3Task1RepeatingNumbers {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        // Read the number of elements
        int N = scanner.nextInt();

        // Initialize an array to count occurrences of numbers between 1 and 10
        int[] count = new int[11]; // indices 1 to 10 will be used

        // Read each number and update the count
        for (int i = 0; i < N; i++) {
            int number = scanner.nextInt();
            count[number]++;
        }

        // Determine the number that occurs the most times
        int maxCount = -1;
        int result = Integer.MAX_VALUE;

        for (int i = 1; i <= 10; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                result = i;
            } else if (count[i] == maxCount) {
                result = Math.min(result, i);
            }
        }

        // Print the result
        System.out.println(result);

        // Close the scanner
        scanner.close();
    }
}
