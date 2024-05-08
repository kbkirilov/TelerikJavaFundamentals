/*

Description
Write a program that finds the length of the maximal sequence of equal elements in an array of N integers.

Input
On the first line you will receive the number N
On the next N lines the numbers of the array will be given

Output
Print the length of the maximal sequence

Constraints
1 <= N <= 1024

 */

import java.util.Scanner;

public class Pack3Task1LongestSequenceOfEqual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // How many lines of numbers we will have
        int n = scanner.nextInt();


        // Declaring an array
        int[] numbers = new int[n];


        // Reading the next line and filling the array
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }


        // The currSequence tracks how many repeats of numbers
        // we have in the adjacent numbers
        int currSequence = 1;


        // The maxSequence tracks the maximum repeats of numbers
        // we have in the whole array
        int maxSequence = 1;


        int index = 1;


        // Finding the repeating numbers sequence
        for (int i = 0; i < numbers.length-1; i++) {
            // If we encounter two equal adjacent numbers
            // we update the current sequence
            if (numbers[index] == numbers[i]) {
                currSequence++;

                // The max sequence is only being updated if the curr
                //sequence is greater than the max sequence
                if (currSequence > maxSequence) {
                    maxSequence = currSequence;
                }

            // If the current adjacent numbers are not equal reset the
            // currSequence variable
            } else {
                currSequence = 1;
            }
            index++;
        }


        System.out.println(maxSequence);

    }
}
