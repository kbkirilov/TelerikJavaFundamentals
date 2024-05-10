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
        String[] numbersAsString  = scanner.nextLine().split(",");

        // Convert the string array to a numbers array
        double[] numbers = new double[numbersAsString .length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Double.parseDouble(numbersAsString [i]);
        }

        // The sum of all the elements in the array
        double sumAllNumbers = 0;
        
        // Summing all the elements int the array
        for (int i = 0; i < numbers.length; i++) {
            // Adding all the elements in the array together
            sumAllNumbers += numbers[i];
            
        }

        // Finding the average that we will need for the
        //comparison
        double average = sumAllNumbers / numbers.length;


        // Declaring two array lists for elements below the
        // average and above the average
        ArrayList<Double> belowAverage = new ArrayList<>();
        ArrayList<Double> aboveAverage = new ArrayList<>();


        // Doing the comparison
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < average) {
                belowAverage.add(numbers[i]);
            } else if (numbers[i] > average){
                aboveAverage.add(numbers[i]);
            }
        }


        // Printing the first line
        System.out.printf("avg: %.2f\n", average);

        // Printing the second line
        System.out.print("below: ");
        for (int i = 0; i < belowAverage.size(); i++) {
            System.out.printf("%.0f", belowAverage.get(i));

            if (i < belowAverage.size() - 1) {
                System.out.print(",");
            }
        }

        System.out.println();

        // Printing the third line
        System.out.print("above: ");
        for (int i = 0; i < aboveAverage.size(); i++) {
            System.out.printf("%.0f", aboveAverage.get(i));

            if (i < aboveAverage.size() - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
    }
}
