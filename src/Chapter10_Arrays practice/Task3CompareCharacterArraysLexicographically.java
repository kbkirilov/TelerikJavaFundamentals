/*

Description
Write a program that compares two char arrays lexicographically (letter by letter). Research how to convert string to char array.

Input
On the first line, you will receive the first array as a string
On the second line, you will receive the second array as a string

Output
Print "first" if the first array is lexicographically smaller
Print "second" if the second array is lexicographically smaller
Print "equal" if the arrays are equal

Constraints
The strings will always be with lower case characters
You do not need to explicitly validate the input

 */

import java.util.Scanner;

public class Task3CompareCharacterArraysLexicographically {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Reading the first and second lines of strings
        String[] stringArr1 = scanner.nextLine().split("");
        String[] stringArr2 = scanner.nextLine().split("");


        // Declaring an empty char arrays
        char[] charArr1 = new char[stringArr1.length];
        char[] charArr2 = new char[stringArr2.length];


        // Filling the char arrays
        for (int i = 0; i < stringArr1.length; i++) {
            charArr1[i] = stringArr1[i].charAt(0);
        }
        for (int i = 0; i < stringArr2.length; i++) {
            charArr2[i] = stringArr2[i].charAt(0);
        }


        // Finding the smaller array length between the two.
        int minLength = Math.min((charArr1.length), charArr2.length);


        // I will store the comparison result in this variable
        String result = "";


        // Comparing the characters till the smaller array's length
        for (int i = 0; i < minLength; i++) {
            if (charArr1[i] < charArr2[i]) {
                result = "first";
                break;
            } else if (charArr2[i] < charArr1[i]) {
                result = "second";
                break;
            } else {
                result = "equal";
            }
        }

        // If one of the arrays is longer than the other it is actually bigger
        // lexicographically. I am checking this here
        if (result.equals("equal")) {
            if (charArr1.length < charArr2.length) {
                result = "first";
            } else if (charArr1.length > charArr2.length) {
                result = "second";
            }
        }

        // Printing the result
        System.out.print(result);
    }
}
