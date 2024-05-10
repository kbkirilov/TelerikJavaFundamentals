/*
Write a program that checks if a list is already sorted. For a list to be sorted,
the next element must NOT be smaller than the previous one.

Input
On the first line - you will receive a number N.
On the next N lines, you will receive a list of numbers, separated by a comma

Output
There are N lines of output
for each list you receive, print 'true' if sorted or 'false' otherwise.

Constraints
1 <= N <= 10
1 <= list.length <= 20

 */


import java.util.Scanner;

public class Pack5Task1IsAListSorted {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // This says how many lists we will get later
        int lines = Integer.parseInt(scanner.nextLine());

        // Loops through all the lines of input we have
        for (int i = 0; i < lines; i++) {

            // Used to check if the list is sorted or not
            boolean isTrue = true;

            // Reads the list elements from the console
            String[] list = scanner.nextLine().split(",");

            // The outer loop
            for (int j = 0; j < list.length; j++) {

                // The inner loop
                for (int k = j + 1; k < list.length ; k++) {

                    // The current number
                    int current = Integer.parseInt(list[j]);

                    // The next number
                    int next = Integer.parseInt(list[k]);

                    if (next < current) {
                        isTrue = false;
                    }
                }
            }

            // Prints the result
            System.out.println(isTrue);
        }
    }
}
