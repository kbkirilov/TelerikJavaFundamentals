/*
Write a program that determines the color of a chessboard square based on its Label and Rank

Labels have values from a to h
Ranks have values from 1 to 8
chessboard scheme

Input
On the first line, you will receive L - the label
On the second line, you will receive R - the rank
Output
On the only line of output, print light or dark, based on your calculations
Constraints
a <= L <= h
1 <= R <= 8
*/
import java.util.Scanner;

public class Pack2Task2ChessSquareColor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String L = scanner.next();
        int R = Integer.parseInt(scanner.next());

        switch (L) {
            case "a":
            case "c":
            case "e":
            case "g":
                if (R % 2 == 0) {
                    System.out.println("light");
                } else if (R % 2 != 0) {
                    System.out.println("dark");
                }
                break;
            case "b":
            case "d":
            case "f":
            case "h":
                if (R % 2 == 0) {
                    System.out.println("dark");
                } else if (R % 2 != 0) {
                    System.out.println("light");
                }
                break;
        }

    }

}
