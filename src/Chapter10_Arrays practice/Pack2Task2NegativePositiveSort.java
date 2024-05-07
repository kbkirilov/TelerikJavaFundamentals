/*
Description
Write a program that moves all negative numbers to the beginning and all positive ones to the end,
without changing the order of positive negative

Input
On a single line you will receive numbers separated by space

Output
Print the sorted numbers

Constraints
The input will consist of valid integer numbers

 */

import java.util.Arrays;
import java.util.Scanner;

public class Pack2Task2NegativePositiveSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input as string
        String[] numbersInput = scanner.nextLine().split(" ");

        // Declaring an empty array
        int[] numbersInt = new int[numbersInput.length];

        // Filling the array with the input values
        for (int i = 0; i < numbersInput.length; i++) {
            numbersInt[i] = Integer.parseInt(numbersInput[i]);
        }


        // Declaring the new arrSorted
        int[] arrSorted = new int[numbersInput.length];


        int indexNegative = arrSorted.length - 1;
        int indexPositive = 0;

        // Sorting the numbers
        for (int i = 0; i < arrSorted.length; i++) {
            if (numbersInt[i] >= 0 ) {
                arrSorted[indexPositive] = numbersInt[i];
                indexPositive++;
            } else {
                arrSorted[indexNegative] = numbersInt[i];
                indexNegative--;
            }

        }

        System.out.println(Arrays.toString(arrSorted));

    }
}
