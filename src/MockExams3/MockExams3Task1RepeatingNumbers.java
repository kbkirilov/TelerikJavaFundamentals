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
        
        // Used to count the number of occurrences of a
        // repeating number
        int temp = 0;
        int maxCount = 0;
        int count = 0;
        int maxNumber = 0;
        int index = 0;

        // Filling the array
        for (int i = 0; i < lines; i++) {
            arrNumbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < arrNumbers.length; i++) {
            
            int currentNumber = arrNumbers[i];

            for (int j = index + 1; j < arrNumbers.length - 1; j++) {
                if (arrNumbers[i] == arrNumbers[j]) {
                    count++;
                }
                index++;
            }

            if (count > maxCount) {
                maxNumber = arrNumbers[i];
            }

            count = 0;
            index = 0;
            
        }

        System.out.println(maxNumber);

    }
}
