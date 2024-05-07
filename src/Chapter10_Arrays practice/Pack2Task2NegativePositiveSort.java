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

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pack2Task2NegativePositiveSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the input
        String[] numbers = scanner.nextLine().split(" ");


        // Numbers array
        int[] numbersInt = new int[numbers.length];


        // Filling the array with separated elements from the input
        for (int i = 0; i < numbersInt.length; i++) {
            numbersInt[i] = Integer.parseInt(numbers[i]);
        }


        // Declaring an array list for both the positive and negative numbers
        // from the numbersInt list
        ArrayList<Integer> numPositive = new ArrayList<>();
        ArrayList<Integer> numNegative = new ArrayList<>();


        // Filling the array list with the elements from the numbersInt array
        for (int i = 0; i < numbersInt.length; i++) {
            if (numbersInt[i] >= 0) {
                numPositive.add(numbersInt[i]);
            } else {
                numNegative.add(numbersInt[i]);
            }
        }


        // Combining the array lists together
        ArrayList<Integer> combined = new ArrayList<>(numNegative);
        combined.addAll(numPositive);


        // Printing the combined array list
        for (int i = 0; i < combined.size(); i++) {
            System.out.printf("%s ", combined.get(i));
        }
    }
}