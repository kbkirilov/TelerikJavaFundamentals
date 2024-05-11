/*
Write a program that converts a number in the range [0…999] to words, corresponding to the English pronunciation.

Input
On a single line you will receive an int number
Output
Print the corresponding pronunciation
Constraints
The input will always be valid and in the described format
All input numbers will be between 0 and 999
*/
import java.util.Scanner;

public class Pack6Task2NumbersAsWords {
    public static void main(String[] args) {
        // Read input
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int number = Integer.parseInt(input);
        // We will use this String to store the converted number
        String result = "";

        // If the number is three digits
        if (input.length() == 3) {
            // Depending on the value of the first digit...
            switch (input.charAt(0)) {
                case '0':
                    // no action is necessary
                    break;
                case '1':
                    // 100 as string is added to the converted number
                    result = "one hundred";
                    // and subtracted from the number as integer
                    number -= 100;
                    break;
                case '2':
                    // same action repeats for every case till 900
                    result = "two hundred";
                    number -= 200;
                    break;
                case '3':
                    result = "three hundred";
                    number -= 300;
                    break;
                case '4':
                    result = "four hundred";
                    number -= 400;
                    break;
                case '5':
                    result = "five hundred";
                    number -= 500;
                    break;
                case '6':
                    result = "six hundred";
                    number -= 600;
                    break;
                case '7':
                    result = "seven hundred";
                    number -= 700;
                    break;
                case '8':
                    number -= 800;
                    result = "eight hundred";
                    break;
                case '9':
                    number -= 900;
                    result = "nine hundred";
                    break;
            }
            // After all cases for the first digit are checked
            // the input value changes to all digits after the first one
            input = input.substring(1);
        }
        // If the remaining number is 2-digit and bigger than zero
        if (input.length() == 2 && number > 0) {
            // and the current result is not empty we add " and "
            if (!result.isEmpty()) {
                result += " and ";
            }
            // Depending on the value of the first digit...
            switch (input.charAt(0)) {
                // no action is necessary
                case '0':
                case '1':
                    break;
                case '2':
                    // 20 as string is added to the converted number
                    result += "twenty ";
                    // and subtracted from the number as integer
                    number -= 20;
                    break;
                case '3':
                    // same action repeats for every case till 90
                    result += "thirty ";
                    number -= 30;
                    break;
                case '4':
                    result += "forty ";
                    number -= 40;
                    break;
                case '5':
                    result += "fifty ";
                    number -= 50;
                    break;
                case '6':
                    result += "sixty ";
                    number -= 60;
                    break;
                case '7':
                    result += "seventy ";
                    number -= 70;
                    break;
                case '8':
                    result += "eighty ";
                    number -= 80;
                    break;
                case '9':
                    result += "ninety ";
                    number -= 90;
                    break;
            }
        }
        // If the remaining number is between 1 and 19 (incl.)
        if (number > 0 && number < 20) {
            // Depending on the value...
            switch (number) {
                case 1:
                    // 1 as a string is added to the converted number
                    result += "one";
                    break;
                case 2:
                    // same action repeats for every case till 19
                    result += "two";
                    break;
                case 3:
                    result += "three";
                    break;
                case 4:
                    result += "four";
                    break;
                case 5:
                    result += "five";
                    break;
                case 6:
                    result += "six";
                    break;
                case 7:
                    result += "seven";
                    break;
                case 8:
                    result += "eight";
                    break;
                case 9:
                    result += "nine";
                    break;
                case 10:
                    result += "ten";
                    break;
                case 11:
                    result += "eleven";
                    break;
                case 12:
                    result += "twelve";
                    break;
                case 13:
                    result += "thirteen";
                    break;
                case 14:
                    result += "fourteen";
                    break;
                case 15:
                    result += "fifteen";
                    break;
                case 16:
                    result += "sixteen";
                    break;
                case 17:
                    result += "seventeen";
                    break;
                case 18:
                    result += "eighteen";
                    break;
                case 19:
                    result += "nineteen";
                    break;
            }
        }
        // If no string was added to the result and the number is 0
        if (result.isEmpty() && number == 0) {
            // Then the converted number should be "zero"
            result = "zero";
        }
        System.out.println(result);
    }
}
