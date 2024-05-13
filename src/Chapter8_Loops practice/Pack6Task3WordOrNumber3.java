/*
Description
You are given an integer number n and then n new lines of text: numbers or words.

If the input is a word, concatenate it with the previous words with a dash only if they are adjacent
If the input is a number, add numbers only if they are adjacent
Input
On the first line, you will receive the number N
On each of the next N lines, you will receive a number or word
If the input is a word it won't contain any digits!
Output
If there is a number after a word we print the concatenated words so far
If there is a word after a number we print the sum so far

 */


import java.util.Scanner;

public class Pack6Task3WordOrNumber3 {
    public static void main(String[] args) {
        // Read the input
        Scanner scanner = new Scanner(System.in);
        // Save the number of next lines as an int in the "lines" variable
        int lines = scanner.nextInt();

        // Create 4 flags (boolean variables) that keep the information if the previous and current lines are words or numbers
        // 1. If both are numbers we should sum them
        // 2. If both are words we should concatenate them
        // 3. If previous is a number but current is a word we should print the sum of the numbers so far and start concatenating the current word
        // 4. If previous is a word but current is a number we should print the concatenated words so far and start adding the current number to a sum
        boolean previousIsDigit = false;
        boolean previousIsWord = false;
        boolean currentIsDigit = false;
        boolean currentIsWord = false;

        // StringBuilder is used here to more efficiently concatenate strings (here we will concatenate the words so far)
        StringBuilder result = new StringBuilder();

        // Create a variable to keep the sum of the numbers so far
        // We initialize it with Integer.MIN_VALUE
        int sum = Integer.MIN_VALUE;

        // We iterate and process all the lines of text
        for (int i = 0; i < lines; i++) {
            // Get the line of text as string
            String input = scanner.next();

            // We use the last character to check if the line is a number because the negative integers do not start
            // with digit - they start with "-"
            // For example: The string "-12" can be parsed to the int -12 and if we check if the first character
            // is a digit won't process it as a number
            if (Character.isDigit(input.charAt(input.length() - 1))) {
                if (previousIsDigit) {
                    // both previous and current are numbers -> we add current to the sum variable
                    sum += Integer.parseInt(input);
                } else {
                    // current is a number but previous is not -> we set the sum to be the value of the number
                    // (this is the first number for this "series")
                    sum = Integer.parseInt(input);
                }
                // Set the flag currentIsDigit to true
                currentIsDigit = true;

                // If we are here then the current line is a word and not a number
            } else {
                if (previousIsWord) {
                    // both current and previous are words -> we concatenate them
                    // append("-") adds "-" to the result (concatenated so far words)
                    // append(input) adds the current word after the "-"
                    result.append("-").append(input);
                } else {
                    // current is a word but the previous is not -> we add "input" to the result without "-"
                    // before as this is the start of a new series of words to concatenate
                    result.append(input);
                }
                // Set the currentIsWord flag to true
                currentIsWord = true;
            }

            // This check handles the very first line (which has no previous so both flags are false as set before the loop)
            if (!previousIsDigit && !previousIsWord) {
                // One of those 2 will be true and the flag will be updated
                previousIsDigit = currentIsDigit;
                previousIsWord = currentIsWord;

                // current are "reset" in order to check the new line that will follow the current
                currentIsDigit = false;
                currentIsWord = false;
                // we go for the next iteration of the loop - do not execute the code from here to the end of
                // the loop body and start a new iteration
                continue;
            }

            // previous is a number and the current is a word
            // print the sum so far then "clear" the sum by setting its value to Integer.MIN_VALUE
            if (previousIsDigit && currentIsWord) {
                System.out.println(sum);
                sum = Integer.MIN_VALUE;
            }

            // previous is a word and current is a number
            // print the result (concatenated so far words)
            // "Reset" the result to new StringBuilder which is "empty"
            if (previousIsWord && currentIsDigit) {
                System.out.println(result);
                result = new StringBuilder();
            }

            // Update flags for the next iteration
            // if current is a number it will become previous for the next iteration
            // if current is a word if will become previous for the next iteration
            previousIsDigit = currentIsDigit;
            previousIsWord = currentIsWord;

            // "Reset" the current flags - those would be updated during the next iteration of the loop
            currentIsDigit = false;
            currentIsWord = false;
        }

        // when the loop is over we need to print what is left in result (if it is not empty)
        if (!result.toString().isEmpty()) {
            System.out.println(result);
        }

        // when the loop is over we need to print what is left in sum (if different from the Integer.MIN_VALUE)
        if (sum != Integer.MIN_VALUE) {
            System.out.println(sum);
        }
    }
}