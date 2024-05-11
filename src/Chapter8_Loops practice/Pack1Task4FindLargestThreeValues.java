/*
Write a program that, that finds the three largest numbers in a sequence and prints them in descending order in the following format:

{largest}, {second_largest} and {third_largest}.

See the example for clarity

Input
On the first line you will receive one number - N - the count of numbers to follow.
On the next N lines you will receive the sequence of numbers, each on a new line.
Output
Output the three largest numbers in the already described format.
Constraints
3 <= N <= 20
-500 <= each number <= 500
*/
import java.util.Scanner;

public class Pack1Task4FindLargestThreeValues {
    public static void main(String[] args) {
        // The scanner is used to read input
        Scanner scanner = new Scanner(System.in);
        // Read the amount of numbers that we need to process
        int numbersCount = scanner.nextInt();
        // We declare a temporary max number variables, set to the minimal value that can be stored in an integer
        // That way, we can be sure, that the first three processed numbers will always be stored as a
        // temporary largest, second largest and third largest number
        // After that, all the next numbers will be compared properly to a number that was already processed
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        // Read input
        // Process it until we read enough numbers, according to the numbersCount value
        for (int i = 0; i < numbersCount; i++) {
            // Store the next number's value to the number variable
            int currentNumber = scanner.nextInt();
            // We only execute this block of code, if the current number is bigger than the current biggest number
            // The next biggest number floats on the top of the list, and pushes the smaller numbers down.
            // Because of the continue operator, the next if blocks are not executed.
            if (currentNumber > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = currentNumber;
                continue;
            }
            // We only execute this block of code, if the current number is smaller than the current biggest number, but
            // bigger than the current second biggest number
            // Because of the continue operator, the last if block is not executed.
            if (currentNumber > secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = currentNumber;
                continue;
            }
            // We only execute this block of code, if the current number is smaller than the current biggest number
            // and the current second biggest number, but bigger than the current third biggest number
            if (currentNumber > thirdLargest) {
                thirdLargest = currentNumber;
            }
        }

        // Print the top 3 numbers
        System.out.printf("%d, %d and %d", largest, secondLargest, thirdLargest);
    }
}
