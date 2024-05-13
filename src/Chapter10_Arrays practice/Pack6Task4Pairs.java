/*

Description
Write a program that finds all pairs of integers whose sum equals a given number.

Input
On the first line, you will receive the target sum N
On the next line, you will receive the numbers
Output
Print all two numbers (pairs) that equal the target sum (N) separated with a comma (",")
If there are no pairs, print "no pairs"
Constraints
All numbers will be valid integers

 */


import java.util.Scanner;

public class Pack6Task4Pairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetSum = Integer.parseInt(scanner.nextLine());

        String[] numbersAsString = scanner.nextLine().split(" ");
        int[] numbers = new int[numbersAsString.length];


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsString[i]);

        }

        boolean havePairs = false;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j <= numbers.length - 1 ; j++) {
                int current = numbers[i];
                int next = numbers[j];

                if (current + next == targetSum) {
                    System.out.printf("%d,%d\n", current, next);
                    havePairs = true;
                } else {
                }
            }
        }

        if (!havePairs) {
            System.out.println("no pairs");
        }
    }
}
