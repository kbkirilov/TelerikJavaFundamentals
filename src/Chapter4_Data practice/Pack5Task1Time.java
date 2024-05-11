/*
Write a program that reads days, hours, minutes and seconds from the standard input. Display the total amount of seconds.

Input
First line - d - days
Second line - h - hours
Third line - m - minutes
Fourth line - s - seconds
Output
On the only line of output, print the total amount of seconds
Constraints
0 <= d, h, m, s <= 1000
*/
import java.util.Scanner;

public class Pack5Task1Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Defining time
        double d = Double.parseDouble(scanner.next()); //days
        double h = Double.parseDouble(scanner.next()); //hours
        double m = Double.parseDouble(scanner.next()); //minutes
        double s = Double.parseDouble(scanner.next()); //seconds

        double daysToSec = (d * 24) * 60 * 60;
        double hoursToSec = (h * 60) * 60;
        double minToSec = m * 60;

        double sumAll = daysToSec + hoursToSec + minToSec + s;

        System.out.printf("%.0f", sumAll);

    }

}
