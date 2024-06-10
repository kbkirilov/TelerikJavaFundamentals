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
        int lines = scanner.nextInt();

        // The input numbers are all between 1 and 10, so we will use this array to count them
        // The counted number will serve as an index to its count
        int[] count = new int[10];

        // Use to store the number the max number of repetitions
        int maxValue = 0;
        for (int i = 0; i < lines; i++) {
            int number = scanner.nextInt();

            // Increase the count associated with that number
            count[number - 1]++;

            // Update the max number of repetitions if necessary
            if (count[number - 1] > maxValue) {
                maxValue = count[number - 1];
            }
        }

        for (int i = 1; i <= 10; i++) {
            // Find the number that corresponds to the max number of repetitions and print it
            if (count[i - 1] == maxValue) {
                System.out.println(i);
                break;
            }
        }
    }
}
