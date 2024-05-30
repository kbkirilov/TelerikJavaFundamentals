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
        Scanner scanner = new Scanner(System.in);

        int lines = scanner.nextInt();
        int[] arrNumbers = new int[lines];

        // Filling the array
        for (int i = 0; i < lines; i++) {
            arrNumbers[i] = scanner.nextInt();
        }

        int maxNumber = arrNumbers[0];

        // Checking up
        for (int i = arrNumbers.length - 1; i >= 1; i--) {
            if (arrNumbers[i] == i) {
                maxNumber = arrNumbers[i];
            }
        }

        System.out.println(maxNumber);

    }
}
