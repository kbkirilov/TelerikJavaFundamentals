/*
Write a program that shows the sign (+, - or 0) of the product of three real numbers, without calculating it.

Use a sequence of if operators.
Input
On the first three lines, you will receive the three numbers, each on a separate line
Output
Output a single line - the sign of the product of the three numbers
Constraints
The input will always consist of valid floating-point numbers
*/
import java.util.Scanner;

public class Pack3Task3MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double a = Double.parseDouble(scanner.next());
        Double b = Double.parseDouble(scanner.next());
        Double c = Double.parseDouble(scanner.next());

        String defaultSign = "-";

        if (a == 0 || b == 0 || c == 0) {
            defaultSign = "0";
        }

        if (a > 0 && b > 0 && c > 0) {
            defaultSign = "+";
        }
        if (a < 0 && b < 0 && c > 0) {
            defaultSign = "+";
        }
        if (a < 0 && b > 0 && c < 0) {
            defaultSign = "+";
        }
        if (a > 0 && b < 0 && c < 0) {
            defaultSign = "+";
        }

        System.out.println(defaultSign);
    }
}
