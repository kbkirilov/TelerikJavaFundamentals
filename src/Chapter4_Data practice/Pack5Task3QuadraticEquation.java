/*
Write a program that reads the coefficients a, b and c of a quadratic equation ax2 + bx + c = 0 and solves it (prints its real roots x1 = (-b - sqrt(D)) / 2a, x2 = (-b + sqrt(D)) / 2a). Assume there always will be one or two real roots (D = b2 - 4ac >= 0).

Input
Read from the standard input

On 3 separate lines, exactly 3 numbers, which are the coefficients.
Output
Print on two separate lines the roots. (look at the sample tests)
Print it to the first integer after the decimal point.
*/
import java.util.Scanner;

public class Pack5Task3QuadraticEquation {
    public static void main(String[] args) {
        /* Read the input
        scanner.nextDouble() is a way to read a double value from the console.
        You can also use scanner.nextLine(), but it reads a line of 'text' from
        the console which then needs to be parsed to a double.*/
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        /* Calculate the discriminant.
        Math.pow(b, 2) is a method that calculates the square of a number.
        In this code, it is used to calculate the discriminant of the quadratic equation
        using the formula d = b^2 - 4ac. The method takes two arguments: the base (b) and the exponent (2).
        It returns the value of b raised to the power of 2. For example, if b is 3, then Math.pow(b, 2) would return 9.*/
        double d = Math.pow(b, 2) - 4 * a * c;

        /* Calculate the roots using the quadratic formula*/
        double x1 = (-b - Math.sqrt(d)) / (2 * a); // first root
        double x2 = (-b + Math.sqrt(d)) / (2 * a); // second root

        /* Print out the roots to one decimal place, printf() prints formatted strings
        Adding 0.0 prevents you from getting -0.0 as a result,
        later in this program you will find out that this can also be achieved using if-else statement*/
        System.out.printf("x1=%.1f%n", x1 + 0.0); // print first root
        System.out.printf("x2=%.1f", x2 + 0.0); // print second root
    }
}
