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

        // Reading the numbers from the console as string
        String[] numbersStr = scanner.nextLine().split(",");

        // Declaring a new array to store the parsed numbers
        int[] numbers = new int[numbersStr.length];

        // Filling the "numbers" array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersStr[i]);
        }


        // Using array list to solve the task
        ArrayList<Integer> arrListNegatives = new ArrayList<>();
        ArrayList<Integer> arrListZeros = new ArrayList<>();
        ArrayList<Integer> arrListPositive = new ArrayList<>();



        // Finding out the negative numbers
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                arrListNegatives.add(numbers[i]);
            }
        }

        // Finding out the zero numbers
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                arrListZeros.add(numbers[i]);
            }
        }

        // Finding out the positive numbers
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                arrListPositive.add(numbers[i]);
            }
        }


        // This will store the ordered array elements
        ArrayList<Integer> arrListCombined = new ArrayList<>();


        // Adding all the values from the previous three arrays
        // to the combined array
        arrListCombined.addAll(arrListNegatives);
        arrListCombined.addAll(arrListZeros);
        arrListCombined.addAll(arrListPositive);


        // Printing the result according to the tas requirements
        for (int i = 0; i < arrListCombined.size(); i++) {
            System.out.print(arrListCombined.get(i));

            // When we get to the last array element the program won't
            // print ","
            if (i < arrListCombined.size() - 1) {
                System.out.print(",");
            }
        }


        // New line after the result has been printed
        System.out.println();

    }
}
