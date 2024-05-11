/*
Write a program that reads two double values from the console A and B, stores them in variables and exchanges their values if the first one is greater than the second one. Use an if-statement. As a result print the values of the variables A and B, separated by a space.

Input
On the first line, you will receive the value of A
On the second line, you will receive the value of B
Output
On the only output line, print the values of the two variables, separated by a whitespace
*/
import java.util.Scanner;
import java.text.DecimalFormat;

public class Pack1Task1ExchangeIfGreater {
    public static void main(String[] args) {
        // Read input
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());

        // We use the format to get the String equivalent of
        // real numbers with decimals different than 0
        DecimalFormat format = new DecimalFormat("0.#");
        String stringA = format.format(a);
        String stringB = format.format(b);

        // Compare the real numbers and
        // print the smaller formatted string first
        if (a < b) {
            // Print formatted
            // %s - print string
            System.out.printf("%s %s", stringA, stringB);
        } else {
            System.out.printf("%s %s", stringB, stringA);
        }
    }
}

