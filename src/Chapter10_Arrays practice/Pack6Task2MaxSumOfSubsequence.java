/*
Write a program that finds the maximal maxSum of consecutive elements in a given array of N numbers.

Can you do it with only one loop (with a single scan through the elements of the array)?
Input
On the first line, you will receive the number N
On the next N lines, the numbers of the array will be given
Output
Print the maximal maxSum of consecutive numbers
Constraints
1 <= N <= 1024

 2 -> temp maxSum = 2     | max maxSum = 2;
 3 -> temp maxSum = 2 + 3 | max maxSum = 5;
-6 -> temp maxSum = 5 - 6 | max maxSum = 5;
-1 -> temp maxSum = 0 - 1 | max maxSum = 5;
 2 -> temp maxSum = 0 + 2 | max maxSum = 5;
-1 -> temp maxSum = 2 - 1 | max maxSum = 5;
 6 -> temp maxSum = 6 + 1 | max maxSum = 7;
 4 -> temp maxSum = 7 + 4 | max maxSum = 11;
-8 -> temp maxSum = 11 - 8| max maxSum = 11;
 8 -> temp maxSum = 3 + 8 | max maxSum = 11;

 */

import java.util.Scanner;

public class Pack6Task2MaxSumOfSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arrNumbers = new int[n];

        // Reading the array elements from the console
        for (int i = 0; i < n; i++) {
            arrNumbers[i] = scanner.nextInt();
        }

        int tempSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arrNumbers.length; i++) {
            // Adding all the elements together
            tempSum += arrNumbers[i];

            // Checks the maxSum
            if (tempSum > maxSum) {
                maxSum = tempSum;
            }

            // if after adding the arr[i] num, the "current sum" went below zero
            // then this is a "failed" subsequence - reset to zero and try the next one
            if (tempSum < 0) {
                tempSum = 0;
            }
        }

        // Output
        System.out.println(maxSum);

    }
}
