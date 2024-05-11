/*
Write a program that reads the radius r of a circle and prints its perimeter and area formatted with 2 digits after the decimal point.

Input
Read from the standard input

Exactly 1 number.
Output
Print the results on separate lines.

Constraints
The input will always be positive number. You do not have to explicitly check if it is valid.
*/
import java.util.Scanner;

public class Pack2Task2CirclePerimeterAndArea {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        double radius = Double.parseDouble(userInput.next());

        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.printf("%.2f%n%.2f", perimeter, area);

    }

}
