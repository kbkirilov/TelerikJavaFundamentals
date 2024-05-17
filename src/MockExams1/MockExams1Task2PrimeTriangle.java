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

        // Reading n
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        // Used to assign elements in the array numbers
        int index = 1;


        // Array list to store all the prime numbers from the input
        // once they have been filtered
        ArrayList<Integer> arrPrimesArrayList = new ArrayList<>();

        // Current number
        int currNumber = 0;

        // Filling the array with the elements from 1 to N
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = index;
            index++;
        }

        // Check if a number is prime or not
        for (int i = 0; i < numbers.length; i++) {

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

            // Add the prime numbers as elements to the array list
            if (isPrime) {
                arrPrimesArrayList.add(currNumber);
            }

        }

        // Convert the array list (which now contains only prime numbers from 1
        // to N) to an array.
        Integer[] arrPrimes = arrPrimesArrayList.toArray(new Integer[0]);

        boolean arePrimes = true;

        // Printing
        for (int i = 0; i < arrPrimes.length; i++) {
            for (int j = 1; j <= arrPrimes[i]; j++) {

                arePrimes = true;

                // Check if number is divisible by any integer from 2 to its square root
                for (int k = 2; k <= Math.sqrt(j) ; k++) {
                    if (j % k == 0) {
                        arePrimes = false;
                    }
                }

                if (arePrimes) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }

            System.out.println();
        }
    }
}
