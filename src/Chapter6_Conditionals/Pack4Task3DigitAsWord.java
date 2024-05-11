/*
Write a program that read a digit [0-9] from the console, and depending on the input, shows the digit as a word (in English).

Print "not a digit" in case of invalid input.
Use a switch statement.
Input
The input consists of one line only, which contains the digit.
Output
Output a single line - should the input be a valid digits, print the english word for the digits. Otherwise, print "not a digit".
Constraints
The input will never be an empty line.
*/
import java.util.Scanner;

public class Pack4Task3DigitAsWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        switch (input) {
            case "0":
                System.out.println("zero");
                break;
            case "1":
                System.out.println("one");
                break;
            case "2":
                System.out.println("two");
                break;
            case "3":
                System.out.println("three");
                break;
            case "4":
                System.out.println("four");
                break;
            case "5":
                System.out.println("five");
                break;
            case "6":
                System.out.println("six");
                break;
            case "7":
                System.out.println("seven");
                break;
            case "8":
                System.out.println("eight");
                break;
            case "9":
                System.out.println("nine");
                break;
            default:
                System.out.println("not a digit");
        }

    }
}
