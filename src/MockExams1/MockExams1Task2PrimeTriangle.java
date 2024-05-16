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


import java.util.Scanner;

public class MockExams1Task2PrimeTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading n
        int n = scanner.nextInt();

        // Generate a sequence of 1 to N inclusive
        int[] numbers = new int[n];

        // Used to assign elements in the array numbers
        int index = 1;

        //
        StringBuilder arrPrimesAsStringBuilder = new StringBuilder();

        // Used to store how many prime number we have found in the array
        // Will be used in the loop in order to print the correct lines
        int primesCount = 0;

        // Current number
        int currNumber = 0;


        // Filling the array with the index variable
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = index;
            index++;
        }

        // Check is a number is prime or not
        for (int i = 0; i < numbers.length; i++) {

            // Is prime?
            boolean isPrime = true;

            // The current number from the array at index i
            currNumber = numbers[i];

            // Check if number is divisible by any integer from 2 to its square root
            for (int j = 2; j <= Math.sqrt(currNumber) ; j++) {
                if (currNumber < 1) {
                    isPrime = false;
                }
                if (currNumber % j == 0) {
                    isPrime = false;
                }
            }

            // Add the count of prime numbers
            if (isPrime) {
                primesCount++;
                arrPrimesAsStringBuilder.append(currNumber);
            }


        }


        String[] arrPrimesAsString = arrPrimesAsStringBuilder.toString().split("");

        int[] arrPrimes = new int[arrPrimesAsString.length];

        boolean arePrimes = true;

        for (int i = 0; i < arrPrimes.length; i++) {
            arrPrimes[i] = Integer.parseInt(arrPrimesAsString[i]);
        }

        for (int i = 0; i < arrPrimes.length; i++) {
            for (int j = 1; j <= arrPrimes[i]; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
