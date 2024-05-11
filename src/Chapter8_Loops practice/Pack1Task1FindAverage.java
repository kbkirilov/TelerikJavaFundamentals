/*
You need to calculate the average of a collection of values. Every value will be valid number. The average must be printed with two digits after the decimal point.

Input
On the first line, you will receive N - the number of the values you must read
On the next N lines you will receive numbers.
Output
On the only line of output, print the average with two digits after the decimal point.
*/
import java.util.Scanner;

public class Pack1Task1FindAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Reading the numbers of lines to follow
        int line = scanner.nextInt();

        //Declaring an initial number
        double currentNumber = 0;

        //Declaring the sum variable
        double sum = 0;


        //Reading the numbers from each new line and updating the sum variable
        for (int i = 0; i < line; i++) {
            currentNumber = scanner.nextDouble();
            sum += currentNumber;
        }

        System.out.printf("%.2f", (sum/line));
    }
}
