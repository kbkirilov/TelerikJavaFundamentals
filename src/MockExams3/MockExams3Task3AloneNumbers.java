/*
We will give you array and a target! You need to find all "alone" elements in the array that match the given target. These elements are alone if they have values before and after them, but those values are different from them.

Return new version of the given array where every element that matches the target and is alone is replaced by whichever value to its left or right is larger.

Input
Read from the standard input:

The first line is the array with coma separated integer values -> 1,2,3
The second line is the target that you should check against -> 2
Output
Print to the standard output:

One line of output - the changed array -> [1, 3, 3]
please note that there is space after each coma.
 */


import java.util.Arrays;
import java.util.Scanner;

public class MockExams3Task3AloneNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrAsString = scanner.nextLine().split(", ");
        int target = Integer.parseInt(scanner.nextLine());

        int[] arrNumbers = new int[arrAsString.length];
        int[] arrNumbersNew = new int[arrAsString.length];

        for (int i = 0; i < arrNumbers.length; i++) {
            arrNumbers[i] = Integer.parseInt(arrAsString[i]);
        }

        for (int i = 0; i < arrNumbersNew.length; i++) {
            arrNumbersNew[i] = arrNumbers[i];
        }

        int currN = 0;
        int nextN = 0;
        int previousN = 0;

        for (int i = 1; i < arrNumbers.length - 1; i++) {

            currN = arrNumbers[i];
            previousN = arrNumbers[i - 1];
            nextN = arrNumbers[i + 1];

            // Is the current number alone?
            if ((currN != previousN && currN != nextN) && currN == target) {
                if (previousN > nextN) {
                    arrNumbersNew[i] = previousN;
                } else {
                    arrNumbersNew[i] = nextN;
                }
            }
        }

        System.out.println(Arrays.toString(arrNumbersNew));

    }
}
