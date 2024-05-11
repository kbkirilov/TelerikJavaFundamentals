/*
Write a program that reads a card sign(as a string) from the console and generates and prints all possible cards from a standard deck of 52 cards up to the card with the given sign(without the jokers). The cards should be printed using classical notation (like 5 of spades, A of hearts, 9 of clubs; and K of diamonds).

The card faces should start from 2 to A(10 is 10).
Print each card face in its four possible suits: clubs, diamonds, hearts, and spades.
Input
On the only line, you will receive the sign of the card to which you should print the cards in the deck.
Output
The output should follow the format defined in the sample tests below.
Constraints
The input character will always be a valid card sign.
*/
import java.util.Scanner;

public class Pack2Task3PrintDeckOfCards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();

        int cardRank = 0;

        switch (userInput) {
            case "2":
                cardRank = 2;
                break;
            case "3":
                cardRank = 3;
                break;
            case "4":
                cardRank = 4;
                break;
            case "5":
                cardRank = 5;
                break;
            case "6":
                cardRank = 6;
                break;
            case "7":
                cardRank = 7;
                break;
            case "8":
                cardRank = 8;
                break;
            case "9":
                cardRank = 9;
                break;
            case "10":
                cardRank = 10;
                break;
            case "J":
                cardRank = 11;
                break;
            case "Q":
                cardRank = 12;
                break;
            case "K":
                cardRank = 13;
                break;
            case "A":
                cardRank = 14;
                break;
        }

        for (int i = 2; i <= cardRank ; i++) {
            String m = String.valueOf(i);
            if (i == 11) {
                m = "J";
            } else if (i == 12) {
                m = "Q";
            } else if (i == 13) {
                m = "K";
            } else if (i == 14) {
                m = "A";
            }

            System.out.printf("%s of spades, ", m);
            System.out.printf("%s of clubs, ", m);
            System.out.printf("%s of hearts, ", m);
            System.out.printf("%s of diamonds%n", m);
        }

    }
}
