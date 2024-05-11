/*
While studying for the exam, you get frustrated with all the boring tasks and decide to come up with a task of your own. You want to find all the 3-digit numbers that are in some interval and whose sum of digits equal some target. You decide to name them exam numbers for good fortune.

Write a program that prints those exam numbers in increasing sequence.

Input
The input consists of exactly 3 lines
x - interval start (inclusive)
y - interval end (inclusive)
t - target sum
Output
Output each exam number on a separate line.
Constraints
100 <= x < y <= 999
*/
import java.util.Scanner;

public class Pack4Task3ExamNumbers {
    public static void main(String[] args) {
        // The scanner is used to read input
        Scanner scanner = new Scanner(System.in);

        // Get x, y, and sum
        int intervalStart = scanner.nextInt();
        int intervalEnd = scanner.nextInt();
        int targetSum = scanner.nextInt();

        for (int i = intervalStart; i <= intervalEnd; i++) {
            int firstDigit = (i / 100) % 10;
            int secondDigit = (i / 10) % 10;
            int thirdDigit = i % 10;

            int digitsSum = firstDigit + secondDigit + thirdDigit;

            if (digitsSum == targetSum) {
                System.out.println(firstDigit + "" + secondDigit + "" + thirdDigit);
            }

        }
    }
}
