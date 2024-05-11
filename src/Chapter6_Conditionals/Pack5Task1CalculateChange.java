/*
Write a program that determines the least amount of coins needed for a cashier to return change.

For example, if the price of something is 0.76 leva and the customer has paid 1 leva, the least amount of coins is 1 x 20 stotinki and 2 x 2 stotinki.

Use the coins of 1 lev, 50, 20, 10, 5, 2 and 1 stotinki.

Input
On the first line, you will receive the price in leva.
On the second line, you will receive how much the customer has paid in leva.
Output
There is a variable amount of output lines.
Print each required denomination on a new line, ordered from highest to lowest.
*/
import java.util.Scanner;

public class Pack5Task1CalculateChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double productPrice = Double.parseDouble(scanner.next());
        Double customerPrice = Double.parseDouble(scanner.next());

        double change = (customerPrice - productPrice) * 100;

        double lev;
        double st50;
        double st20;
        double st10;
        double st5;
        double st2;
        double st1;

        if (change >= 100) {
            lev = change / 100;
            change = change % 100;
            System.out.printf("%.0f x 1 lev\n", Math.floor(lev));
        }
        if (change >= 50) {
            st50 = change / 50;
            change = change % 50;
            System.out.printf("%.0f x 50 stotinki\n", Math.floor(st50));
        }
        if (change >= 20) {
            st20 = change / 20;
            change = change % 20;
            System.out.printf("%.0f x 20 stotinki\n", Math.floor(st20));
        }
        if (change >= 10) {
            st10 = change / 10;
            change = change % 10;
            System.out.printf("%.0f x 10 stotinki\n", Math.floor(st10));
        }
        if (change >= 5) {
            st5 = change / 5;
            change = change % 5;
            System.out.printf("%.0f x 5 stotinki\n", Math.floor(st5));
        }
        if (change >= 2) {
            st2 = change / 2;
            change = change % 2;
            System.out.printf("%.0f x 2 stotinki\n", Math.floor(st2));
        }
        if (change >= 1) {
            st1 = change / 1;
            change = change % 1;
            System.out.printf("%.0f x 1 stotinka\n", Math.floor(st1));
        }

    }
}
