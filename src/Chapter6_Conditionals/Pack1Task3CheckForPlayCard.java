/*
Description
Classical play cards use the following signs to designate the card face: 2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K and A. Write a program that enters a string and prints "yes" if it is a valid card sign or "no" otherwise.

Input
On the only line you will receive a single string.
Output
Output "yes" if the string is a card sign, otherwise print "no".
Constraints
String length will always be between 1 and 5
*/
import java.util.Scanner;

public class Pack1Task3CheckForPlayCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next();

        if (input.equals("2") || input.equals("3") || input.equals("4") ||
                input.equals("5") || input.equals("6") || input.equals("7") ||
                input.equals("8") || input.equals("9") || input.equals("10") ||
                input.equals("J") || input.equals("Q") || input.equals("K") ||
                input.equals("A")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

}
