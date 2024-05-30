/*
Merging and Squashing
We have the following operations defined for two-digit numbers. There are two possible ways of merging them:

Merging ab and cd produces bc
42 merged with 17 produces 21
17 merged with 42 produces 74
Squashing ab and cd produces a(b+c)d - the middle digit is the sum of b and c
42 squashed with 17 produces 437
39 squashed with 57 produces 347 (9 + 5 = 14, we use only the 4)
You have a sequence of N two-digit numbers. Your task is to merge and squash each pair of adjacent numbers.

Input
All input data is read from the standard input

On the first line, you will receive an integer N
On the next N lines you will receive N two-digit numbers
Each number will be on a separate line
Output
The output data is printed on the standard output

On the first output line print the merged numbers

There should be N - 1 of them
Separate them by spaces
On the second output line print the squashed numbers

There should be N - 1 of them
Separate them by spaces
Constraints
2 <= N <= 1000
Numbers will consist of two non-zero digits
The input data will always be correct and there is no need to check it explicitly
 */

import java.util.Scanner;

public class MockExams2MergingAndSquashing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        StringBuilder mergedNumbers = new StringBuilder();
        StringBuilder squashedNumbers = new StringBuilder();

        for (int i = 0; i < n - 1; i++) {
            // merged numbers => ac ds = bc
            mergedNumbers.append(numbers[i] % 10);
            mergedNumbers.append(numbers[i + 1] / 10);
            mergedNumbers.append(" ");


            // squashed numbers => ab cd = a(b+c)d
            squashedNumbers.append(numbers[i] / 10);
            int squashedMiddleNumber = (numbers[i] % 10) + (numbers[i + 1] / 10);
            squashedMiddleNumber %= 10;
            squashedNumbers.append(squashedMiddleNumber);
            squashedNumbers.append(numbers[i + 1] % 10);
            squashedNumbers.append(" ");


        }

        mergedNumbers.deleteCharAt(mergedNumbers.length() - 1);
        squashedNumbers.deleteCharAt(squashedNumbers.length() - 1);

        System.out.println(mergedNumbers);
        System.out.println(squashedNumbers);


    }
}
