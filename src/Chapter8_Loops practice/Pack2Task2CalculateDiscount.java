/*
You need to calculate the discounted price for each item in your shopping cart. The discount is 65%, a real deal for you.

Input
On the first line, you will receive N - the number of the items in your shopping cart
On the next N lines you will each item's price
Output
On each line in the output print the discounted price of the item with two digits after the decimal point (Math rules for rounding apply)
*/
import java.util.Scanner;

public class Pack2Task2CalculateDiscount {
    public static void main(String[] args) {
        // The scanner is used to read input
        Scanner scanner = new Scanner(System.in);
        // Read the amount of lines of input that we need to process
        int lines = scanner.nextInt();
        // Initialize a variable price, where we would
        // temporarily store every product's price
        double price = 0;
        // Initialize a variable discount price, where we would
        // temporarily store every product's discounted price
        double discountPrice = 0;

        // Read input
        // Process it until we read enough numbers, according to the lines variable value
        for (int i = 1; i <= lines; i++) {
            // Store the next price in the current price variable
            price = scanner.nextDouble();
            // Calculate the discounted price according to the problem description
            discountPrice = price - ((price * 65)/ 100);
            // Print the discounted price with two digits after the decimal point
            System.out.printf("%n%.2f", discountPrice);

        }
    }
}
