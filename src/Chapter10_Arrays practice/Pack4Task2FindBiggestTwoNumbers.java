/*
Description
Write a program that finds the two biggest numbers from an array of integers

Input
On the first line you will receive the numbers separated by space

Output
Print on a single line the biggest two numbers separated by space

Constraints
Each number will be a valid integer number

 */

import java.util.Scanner;

public class Pack4Task2FindBiggestTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get numbersAsString as array
        String[] numbersAsString  = scanner.nextLine().split(" ");

        //Declaring the int array
        int[] numbers = new int[numbersAsString.length];

        // Filling the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }


        // Declaring variables for largest and second-largest numbers
        int largest = Integer.MIN_VALUE;
        int secondLarger = Integer.MIN_VALUE;


        // Doing the checkup
        for (int i = 0; i < numbers.length; i++) {

            int current = numbers[i];

            if (current > largest) {
                secondLarger = largest;
                largest = current;
            } else if (current > secondLarger) {
                secondLarger = current;
            }
        }
        System.out.println(largest + " " + secondLarger);
    }
}
