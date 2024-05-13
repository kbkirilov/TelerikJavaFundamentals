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

        // Declaring a new array for the sorted elements
        String[] numSorted = new String[numbersAsString.length];


        int index = 0;

        // Fill the numSorted array with all the elements except the zeros
        for (String num : numbersAsString) {
            //Skip the zeros
            if (num.equals("0")) {
                continue;
            // Fill the elements according to their original order
            } else {
                numSorted[index] = num;
                index++;
            }
        }

        // This keeps track of the correct index when adding the zeros to the
        // numSorted array
        int indexZeros = 0;

        // Adding the zeros at the end of the array
        for (String num : numSorted) {
            if (num == null) {
                numSorted[indexZeros] = "0";
            }
            indexZeros++;
        }

        // Printing the result
        System.out.println(String.join(",", numSorted));

    }
}
