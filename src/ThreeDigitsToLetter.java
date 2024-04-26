import java.util.Scanner;

public class ThreeDigitsToLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write a program that read a three-digit integer number from the console,
        // sums the number and gets the equivalent letter from the alphabet.

        String userInput = scanner.next();

        //Validate the userInput
        if (userInput.length() != 3) {
            System.out.println("invalid userInput");
        }

        // Parse the strings to get the separate numbers
        int digit1 = Integer.parseInt(String.valueOf(userInput.charAt(0)));
        int digit2 = Integer.parseInt(String.valueOf(userInput.charAt(1)));
        int digit3 = Integer.parseInt(String.valueOf(userInput.charAt(2)));

        // Getting the letterIndex
        int letterIndex = (digit1 + digit2 + digit3) - 1;

        // All the letters in the alphabet in a single string
        String alphabet = "абвгдежзийклмнопрстуфхцчшщъьюя";

        // Printing the letter to make a work with.
        System.out.println(alphabet.charAt(letterIndex));



    }
}
