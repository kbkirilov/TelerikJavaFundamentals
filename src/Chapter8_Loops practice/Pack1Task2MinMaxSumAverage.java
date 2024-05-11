/*
Write a program that reads from the console a sequence of N real numbers and returns the minimal, the maximal number, the sum and the average of all numbers (displayed with 2 digits after the decimal point).

The input starts by the number N (alone in a line) followed by N lines, each holding an real number.
The output is like in the examples below.
Input
On the first line, you will receive the number N.
On each of the next N lines, you will receive a single real number.
Output
You output must always consist of exactly 4 lines - the minimal element on the first line, the maximal on the second, the sum on the third and the average on the fourth, in the following format:
min=3.00
max=6.00
sum=9.00
avg=4.50
Constraints
1 <= N <= 1000
All numbers will be valid numbers that will be in the range [-10000, 10000]
*/
import java.util.Scanner;

public class Pack1Task2MinMaxSumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Sets how many lines of numbers will follow
        int lines = scanner.nextInt();

        //Sets the minimal variable
        double minValue = 10000;

        //Sets the max variable
        double maxValue = -10000;

        //Sets the sum
        double sum = 0;

        for (int i = 0; i < lines; i++) {
            double currentNumber = scanner.nextDouble();

            //Checks the min value number
            if (currentNumber < minValue) {
                minValue = currentNumber;
            }

            //Checks the max value number
            if (currentNumber > maxValue) {
                maxValue = currentNumber;
            }

            //Checks the sum
            sum += currentNumber;

        }
        System.out.printf("min=%.2f%n" +
                "max=%.2f%n" +
                "sum=%.2f%n" +
                "avg=%.2f%n", minValue, maxValue, sum, (sum/lines));

    }
}
