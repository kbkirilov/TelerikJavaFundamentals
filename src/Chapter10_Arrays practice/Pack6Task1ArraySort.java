/*
Given an array integers, write a program that moves all the zeroes to the end of it,
while maintaining the relative order of the non-zero elements.

Input
Read from the standard input:

There is one line of input, containing N amount of integers, separated by a comma (",")
Output
Print to the standard output:

There is one line of output, containing the sorted integers, separated by a comma (",")
Constraints
5 <= N <= 1000
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Pack6Task1ArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the input
        String[] numbersAsString = scanner.nextLine().split(",");

        int[] numbers = new int[numbersAsString.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }

        int zeros = 0;

        // Finding the zeros in the array
        for (int i = 0; i < numbers.length; i++) {
            int current = numbers[i];

            if (current == 0) {
                zeros++;
            }
        }

        int[] numSorted = new int[numbers.length];

        int index = 0;

        for (int num : numbers) {
            if (num == 0) {
                continue;
            } else {
                numSorted[index] = num;
                index++;
            }

        }

        for (int numbersSorted : numSorted) {
            if (numbersSorted != numbersSorted[numbersSorted.length -1 ]) {

            }
        }

    }
}
