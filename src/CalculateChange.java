import java.util.Scanner;

public class CalculateChange {
    public static void main(String[] args) {
        // The scanner is used to read input
        Scanner scanner = new Scanner(System.in);
        // We will store the amount of 1 lev coins here
        double lev;
        // We will store the price that the customer needs to pay here
        double price = scanner.nextDouble();
        // We will store the price that the customer actually paid to the cashier
        double paid = scanner.nextDouble();
        // We will calculate the total change, that the cashier has to give in return to the customer
        // We are multiplying it by 100 to simplify the problem, by representing it as stotinki only - 1 lev = 100 stotinki
        double change = (paid - price) * 100;
        // If we have 100 or more stotinki left, we need to return at least 1 coin of 1 lev
        if (change >= 100) {
            // We calculate the amount of 1 lev coins we need to return by using the division operator
            lev = change / 100;
            // We calculate the amount of change left to return after returning the 1 lev coins by using the modulus division operator
            change = change % 100;
            // We print the amount of 1 lev coins returned, according to the problem description
            System.out.printf("%.0f x 1 lev\n", lev);
        }
        // If we have 50 or more stotinki left, we need to return exactly 1 coin of 50 stotinki
        if (change >= 50) {
            // We subtract 50 stotinki from the amount of change left
            change = change - 50;
            // We print the amount of 50 stotinki coins returned, according to the problem description
            System.out.println("1 x 50 stotinki");
        }
        // If we have 20 or more stotinki left, we need to return 1 or 2 coins of 20 stotinki
        if (change >= 20) {
            // We use the division operator to calculate the amount of 20 stotinki coins we need to return 
            // and store the quantity in the lev variable
            lev = change / 20;
            // We calculate the amount of change left to return after returning the 20 stotinki coins by using the modulus division operator
            change = change % 20;
            // We print the amount of 20 stotinki coins returned, according to the problem description
            System.out.printf("%.0f x 20 stotinki\n", lev);
        }
        // If we have 10 or more stotinki left, we need to return exactly 1 coin of 10 stotinki
        if (change >= 10) {
            // We subtract 10 stotinki from the amount of change left
            change = change - 10;
            // We print the amount of 10 stotinki coins returned, according to the problem description
            System.out.println("1 x 10 stotinki");
        }
        // If we have 5 or more stotinki left, we need to return exactly 1 coin of 5 stotinki
        if (change >= 5) {
            // We subtract 5 stotinki from the amount of change left
            change = change - 5;
            // We print the amount of 5 stotinki coins returned, according to the problem description
            System.out.println("1 x 5 stotinki");
        }
        // If we have 2 or more stotinki left, we need to return 1 or 2 coins of 2 stotinki
        if (change >= 2) {
            // We use the division operator to calculate the amount of 2 stotinki coins we need to return 
            // and store the quantity in the lev variable
            lev = (change / 2);
            // We calculate the amount of change left to return after returning the 2 stotinki coins by using the modulus division operator
            change = change % 2;
            // We print the amount of 2 stotinki coins returned, according to the problem description
            System.out.printf("%.0f x 2 stotinki\n", lev - 0.5);
        }
        // If we have 1 or more stotinki left, we need to return exactly 1 coin of 1 stotinki
        if (change >= 1) {
            // We print the amount of 1 stotinki coins returned, according to the problem description
            System.out.println("1 x 1 stotinka");
        }
    }
}