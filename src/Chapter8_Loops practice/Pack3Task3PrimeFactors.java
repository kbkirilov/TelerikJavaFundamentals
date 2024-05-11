/*
Write a program that finds the prime factors of a given non-prime number. List the factors in ascending order.

12 = 2 * 2 * 3
100 = 2 * 2 * 5 * 5
Input
On the first line you will receive one number - N
Output
Output each prime factor on a newline.
*/
import java.util.Scanner;

public class Pack3Task3PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        while (number != 1) {
            for (int i = 2; i <= number ; i++) {
                if (number % i == 0) {
                    number /= i;
                    System.out.println(i);
                    break;
                }
            }
        }

    }
}