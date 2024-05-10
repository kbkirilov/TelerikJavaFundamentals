/*
Sort Numbers
Write a program that reads a list of numbers separated by a comma and space.

Arrange the numbers in descending order.

Output all numbers on a single line, separated by a comma and a space.

Input
On the only line you will receive all the numbers to be sorted.

Output
On the only line of output, print all the numbers sorted in format n1, n2, n3, .. n
 */

import java.util.Scanner;

public class Pack4Task3SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers  = scanner.nextLine().split(", ");


        // Create outer loop to iterates over ALL numbers i = 0 to numbers length
        // The idea is that in the inner loop:
        // first number is compared to all the number to it's right
        // second number is compared to all the number to it's right except the first
        // third number is compared to all the number to it's right except the first & second
        // and so on...
        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {

                // Gets the parsed current number
                int current = Integer.parseInt(numbers[i]);

                // This is the next number
                int next = Integer.parseInt(numbers[j]);

                if (next > current) {
                    String temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }

        System.out.print(String.join(", ", numbers));

    }
}
