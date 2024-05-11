/*
Description
Write a program that, for a given two numbers N and X, calculates the sum S = 1 + 1!/x + 2!/x2 + … + N!/xN.

Use only one loop. Print the result with 5 digits after the decimal point.
Each element is calculated as follows: (previous_element) * i / x
Input
On the first line you will receive one number - N.
On the second line you will receive another number - X.
Output
Output only one number - the sum of the sequence for the given N and X.
Constraints
N will always be a valid integer between 2 and 10, inclusive.
X will always be a valid floating-point number between 0.5 and 100
*/
import java.util.Scanner;

public class Pack3Task1CalculateComplexSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Read the inputs
        int n = scanner.nextInt();
        double x = scanner.nextInt();

        //Declaring a variables for sum and c
        double sum = 1;
        //Current factorial value
        int f = 1;

        //Looping through the calculations
        for (int i = 1; i <= n; i++) {

            f *= i;

            sum += (f / Math.pow(x, i));

        }
        System.out.printf("%.5f", sum);
    }
}
