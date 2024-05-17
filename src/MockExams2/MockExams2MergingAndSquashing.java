/*
Merging and Squashing
We have the following operations defined for two-digit numbers. There are two possible ways of merging them:

Merging ab and cd produces bc
42 merged with 17 produces 21
17 merged with 42 produces 74
Squashing ab and cd produces a(b+c)d - the middle digit is the sum of b and c
42 squashed with 17 produces 437
39 squashed with 57 produces 347 (9 + 5 = 14, we use only the 4)
You have a sequence of N two-digit numbers. Your task is to merge and squash each pair of adjacent numbers.

Input
All input data is read from the standard input

On the first line, you will receive an integer N
On the next N lines you will receive N two-digit numbers
Each number will be on a separate line
Output
The output data is printed on the standard output

On the first output line print the merged numbers

There should be N - 1 of them
Separate them by spaces
On the second output line print the squashed numbers

There should be N - 1 of them
Separate them by spaces
Constraints
2 <= N <= 1000
Numbers will consist of two non-zero digits
The input data will always be correct and there is no need to check it explicitly
 */

import java.util.Scanner;

public class MockExams2MergingAndSquashing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the lines
        int lines = Integer.parseInt(scanner.nextLine());

        String[] numbersAsString = new String[lines];

        // Used for storing the result numbers
        StringBuilder numbersMerges = new StringBuilder();
        StringBuilder numbersSquashed = new StringBuilder();

        // Fill the string array with the numbers
        for (int i = 0; i < lines; i++) {
            numbersAsString[i] = scanner.nextLine();
        }

        // Third number
        int middleNumber = 0;

        String middleNumberAsString = "";

        String temp = "";

        //
        int currElIndex1Int = 0;
        int nextEllIndex0Int = 0;

        // Loops through the numbers
        for (int i = 0; i < numbersAsString.length - 1; i++) {

            // Gets the current and next elements in the arrStr array
            String currEl = numbersAsString[i];
            String nextEl = numbersAsString[i + 1];

            // Get the characters
            String currElIndex0 = Character.toString(currEl.charAt(0));
            String currElIndex1 = Character.toString(currEl.charAt(1));
            String nextElIndex0 = Character.toString(nextEl.charAt(0));
            String nextElIndex1 = Character.toString(nextEl.charAt(1));

            // Parse to int
            currElIndex1Int = Integer.parseInt(currElIndex1);
            nextEllIndex0Int = Integer.parseInt(nextElIndex0);

            // Fills the numbersMerges string
            numbersMerges.append(currElIndex1 + "" + nextElIndex0 + " ");

            // Gets the middle number when calculating the squashing algorithm
            if (currElIndex1Int + nextEllIndex0Int < 10 ) {
                middleNumber = currElIndex1Int + nextEllIndex0Int;
                middleNumberAsString = String.valueOf(middleNumber);
            } else {
                middleNumber = currElIndex1Int + nextEllIndex0Int;
                temp = String.valueOf(middleNumber);
                middleNumberAsString = Character.toString(temp.charAt(1));
            }

            // Fills the numbersSquashed string
            numbersSquashed.append(currElIndex0 + "" + middleNumberAsString + "" + nextElIndex1 + " ");

        }

        System.out.println(numbersMerges);
        System.out.println(numbersSquashed);
    }
}
