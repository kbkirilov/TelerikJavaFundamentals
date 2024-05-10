/*
Below and Above Average
Write a program that calculates the sumAllNumbers of a list of numbers. Display the sumAllNumbers, all the numbers
below the sumAllNumbers, and all the numbers above the sumAllNumbers. Maintain the relative order of numbers.

Input
On the only line of input, you will receive the numbers, separated by a comma.

Output
On the first line, print the sumAllNumbers, with two digits after the decimal separator.
On the second line, print all the numbers bellow the sumAllNumbers
On the third line, print all the numbers above the sumAllNumbers

Constraints
1 <= list.length <= 20

 */


import java.util.ArrayList;
import java.util.Scanner;

public class Pack4Task1BelowandAboveAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get numbersAsString as array
        String[] numbers  = scanner.nextLine().split(",");

        StringBuilder below = new StringBuilder();
        StringBuilder above = new StringBuilder();

        // Calculate the sum of all numbers by iterating over them and adding
        // the current number to the sum variable
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += Integer.parseInt(numbers[i]);
        }

        double avg = sum / numbers.length;

        // Filling the string builders with values
        for (int i = 0; i < numbers.length; i++) {

            // Declaring and initializing a current variable
            // Parsing the number, so it can be used in
            // calculations
            int current = Integer.parseInt(numbers[i]);

            // Building a new string
            if (current < avg) {
                // Append the number to the list of numbers below avg, then append a comma
                below.append(current).append(",");
            } else if (current > avg) {
                // Append the number to the list of numbers below avg, then append a comma
                above.append(current).append(",");
            }
        }

        // Deleting the commas
        below.deleteCharAt(below.length() - 1);
        above.deleteCharAt(above.length() - 1);

        // Output
        System.out.printf("avg: %.2f%n", avg);
        System.out.printf("below: %s%n", below);
        System.out.printf("above: %s", above);

    }
}
