/*

Description
We know that you love math, so we have prepared a very interesting task, that involves both geometry and prime numbers.

By a given N number, from which you need to generate a sequence of 1 to N inclusive. For every prime number in that sequence, you need to print out all the other numbers before it (and the number itself), whether they are prime or not

Note:
For the purposes of this task (and against the laws of mathematics), the number 1 is considered as prime.

Example
Let's say N=10

We have the sequence 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
The prime numbers are 1, 2, 3, 5, 7 - 5 prime numbers, so we print 5 rows
Each row contains all the numbers for 1 to PRIME_NUMBER

 */


import java.util.ArrayList;
import java.util.Scanner;

public class MockExams1Task2PrimeTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean[] arr = new boolean[n + 1];

        // Loops through each number in n (if n=5, the loop goes 1,2,3,4,5)
        for (int currentNumber = 1; currentNumber <= n; currentNumber++) {
            boolean isPrime = true;

            // Checks if the current number is prime or not
            for (int divisor = 2; divisor < currentNumber; divisor++) {
                if (currentNumber % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            arr[currentNumber] = isPrime;
            // Prints the rows
            if (isPrime == true) {
                for (int j = 1; j <= currentNumber; j++) {
                    if (arr[j] == true) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                }
                System.out.println();
            }
        }
    }
}
