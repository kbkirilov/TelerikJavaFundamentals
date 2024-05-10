/*
Write a program that orders a list of numbers in the following way:

3,-2,1,0,-1,0,-2,1 -> -2,-1,-2,0,0,3,1,1
You need to find out the criteria for yourself by looking at the example. You can also check the example below.

Input
On the only line of input, you will receive the numbers, separated by a comma.

Output
Display the list with the mysterious ordering applied removed, separated by a comma.

Constraints
1 <= list.length <= 20

 */

import java.util.ArrayList;
import java.util.Scanner;

public class Pack3Task2StrangeOrders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get numbersAsString as array
        String[] numbersAsString  = scanner.nextLine().split(",");

        // Convert the string array to a numbers array
        int[] numbers = new int[numbersAsString .length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString [i]);
        }


        // Create a new string array in which we will keep the 'strange order'
        String[] result = new String[numbers.length];


        // This will point where to write in the 'result' array
        int index = 0;

        // This loop is for all the negative number
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                result[index] = String.valueOf(numbers[i]);
                index++;
            }
        }

        // This loop is for all zeroes. The index is not
        // reset because it needs to write values to the
        // correct places
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                result[index] = String.valueOf(numbers[i]);
                index++;
            }
        }

        // This loop is for all the positive numbers
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                result[index] = String.valueOf(numbers[i]);
                index++;
            }
        }

        System.out.print(String.join(",", result));


    }
}
