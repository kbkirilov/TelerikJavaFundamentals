/*
Description
Write a program that determines if an array of integers is in Wave Form

Input
On a single line you will receive numbers separated by space

Output
Print "yes" if the array is in Wave Form - e.g. first > second < third > fourth < fifth >
Print "no" if the array is not in Wave Form

Constraints
The input will consist of valid integer numbers

 */


import java.util.Scanner;

public class Pack5Task3IsArrayInWaveForm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the input
        String[] numbersAsString = scanner.nextLine().split(" ");

        int[] numbers = new int[numbersAsString.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);
        }

        String result = "yes";

        // We maintain three indices as we need to compare three consecutive numbers:
        int firstNumber = 0;
        int secondNumber = 1;
        int thirdNumber = 2;

        while (thirdNumber < numbers.length) {
            if ((numbers[firstNumber] <= numbers[secondNumber] && numbers[secondNumber] <= numbers[thirdNumber]) ||
                    (numbers[firstNumber] >= numbers[secondNumber] && numbers[secondNumber] >= numbers[thirdNumber])) {
                result = "no";
            }

            // Move indices to the next three consecutive numbers
            firstNumber++;
            secondNumber++;
            thirdNumber++;

        }

        // Output
        System.out.println(result);

    }
}
