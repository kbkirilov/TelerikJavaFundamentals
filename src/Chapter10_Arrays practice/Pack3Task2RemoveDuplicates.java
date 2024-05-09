/*
Write a program that removes all duplicates from a list of elements.

1,2,2,2,4,7 -> 1,2,4,7.
Maintain the relative order of the remaining items.

Input
On the only line of input, you will receive the elements, separated by a comma.

Output
Display the list with the duplicates removed, separated by a comma.

Constraints
1 <= list.length <= 20
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pack3Task2RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the array of strings and save it in "numbers" variable
        String[] numbers = scanner.nextLine().split(",");


        // Create count for the number of duplicates - we will need it later
        int duplicatesCount  = 0;


        // Create outer loop for each value except the last (from 0 to numbers.length - 1)
        for (int i = 0; i < numbers.length - 1; i++) {

            // Inner loop starts from the next value (k = i + 1)
            for (int k = i + 1; k <= numbers.length - 1 ; k++) {

                // If value from inner loop (k)
                // is equal to value from outer loop (i)
                // and number from outer loop is not yet marked as duplicate ('x')
                if (numbers[i].equals(numbers[k]) && !numbers[i].equals("x")) {

                    // then mark the found duplicate with a symbol
                    numbers[k] = "x";

                    // count that another duplicate is found
                    duplicatesCount++;
                }
            }
        }

        // Store the unique values in this array
        // This is why we needed to count the number of duplicates
        String[] uniqueValues = new String[numbers.length - duplicatesCount];


        int index = 0;


        // Filling the unique values array
        for (String number : numbers) {
            // Skip if marked as duplicate
            if (number.equals("x")) {
                continue;
            }
            // Copy the uniqueValue from the original array to the new array
            uniqueValues[index] = number;
            index++;
        }

        // Output
        System.out.print(String.join(",", uniqueValues));

    }
}
