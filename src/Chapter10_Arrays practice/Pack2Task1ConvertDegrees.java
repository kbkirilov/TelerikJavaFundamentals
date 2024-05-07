/*
Description:
You need to provide conversion of the temperature given in Celsius to their Fahrenheit representation.

Input
On the first line, you will receive a list of values separated by a single space.

Output
On each line in the output print the converted temperature. Print a whole number rounded to the nearest integer
(Math rules apply) and without digits after the decimal point.
 */

import java.util.Scanner;

public class Pack2Task1ConvertDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Gets the inputCelsius as string
        String[] inputCelsius = scanner.nextLine().split(" ");


        // Declaring two double arrays
        double[] doubleCelsius = new double[inputCelsius.length];
        double[] doubleFarenheit = new double[inputCelsius.length];


        // Filling the doubleCelsius array and making the conversion
        for (int i = 0; i < doubleCelsius.length; i++) {
            doubleCelsius[i] = Double.parseDouble(inputCelsius[i]);
            doubleFarenheit[i] = doubleCelsius[i] * 1.8 + 32;
        }


        // Printing the Farenheit values
        for (double d : doubleFarenheit) {
            System.out.println(Math.round(d));
        }
    }
}
