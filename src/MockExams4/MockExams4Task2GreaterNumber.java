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
        String[] arrBAsString = scanner.nextLine().split(",");
        String[] arrAAsString = scanner.nextLine().split(",");

        int index = 0;

        int[] arrB = new int[arrBAsString.length];
        int[] arrA = new int[arrAAsString.length];

        for (int i = 0; i < arrB.length; i++) {
            arrB[i] = Integer.parseInt(arrBAsString[i]);
        }

        for (int i = 0; i < arrA.length; i++) {
            arrA[i] = Integer.parseInt(arrAAsString[i]);
        }

        // Filling the array list
        ArrayList<Integer> result = new ArrayList<>();

        // Looping through the elements in the subset array B
        for (int i = 0; i < arrB.length; i++) {
            int currB = arrB[i];

            for (int j = 0; j < arrA.length; j++) {
                int currA = arrA[j];

                if (currB == currA && j != arrA.length - 1) {
                    for (int k = j + 1; k <= arrA.length ; k++) {
                        int nextA = arrA[k];

                        if (nextA > currB) {
                            result.add(nextA);
                            break;
                        } else if (nextA <= currB && k == arrA.length - 1) {
                            result.add(-1);
                            break;
                        }
                    }
                } else if (currB == currA && j == arrA.length - 1) {
                    result.add(-1);
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
