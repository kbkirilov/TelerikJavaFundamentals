/*
Greater Number
You are given two arrays where the elements of the first one are subset of the elements of the second one. For each element in the first array, find the next greater element in the second array, starting at the position of the given element.

Input
Read from the standard input.
On the first line will be the first array of numbers, separated by comma.
On the second line will be the second array of numbers, separated by comma.
Output
Print the result on the standard output.
The result should be the numbers, separated by comma.
Constraints
All elements will be unique (the elements from the first array are unique in the first array, the elements from the second array are unique in the second array).
The length of both arrays would not exceed 1000.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MockExams4Task2GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the parent set A and the subset B
        // We first read the subset (set B) and then we read
        // the second one, which is the parent set (set A)
        String[] arrB = scanner.nextLine().split(",");
        String[] arrA = scanner.nextLine().split(",");

        // Filling the array list
        ArrayList<Integer> result = new ArrayList<>();

        int maxIndexB =  arrB.length - 1;

        for (int i = 0; i < arrB.length; i++) {

            String currElementInBAsString = arrB[i];
            int currElementInBAsInt = Integer.parseInt(arrB[i]);

            for (int j = 0; j < arrA.length; j++) {

                if (currElementInBAsString.equals(arrA[j])) {

                    int currElementInAAsInt = Integer.parseInt(arrA[j]);

                    // Check if this is the last element in arrA
                    if (j != arrA.length - 1) {
                        // The next element in the parent arrA
                        int nextElementInAAsInt = Integer.parseInt(arrA[j + 1]);

                        if (nextElementInAAsInt > currElementInBAsInt) {
                            result.add(nextElementInAAsInt);
                        } else {
                            result.add(-1);
                        }
                    } else {
                        result.add(-1);
                    }
                }

            }
        }


        // Prints the result
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i != result.size() - 1) {
                System.out.print(",");
            }
        }

    }
}
