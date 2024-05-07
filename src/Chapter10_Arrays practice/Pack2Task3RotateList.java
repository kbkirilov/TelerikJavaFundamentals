/*
Write a program that rotates a list several times (the first element becomes last).

list = 1,2,3,4,5 and N = 2 -> result = 3,4,5,1,2
Note that N could be larger than the length of the list.

list = 1,2,3,4,5 and N = 6 -> result = 2,3,4,5,1

Input
On the first line you will receive the list of numbers.
On the second line you will receive N

Output
On the only line of output, print the numbers separated by a comma.
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Pack2Task3RotateList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the numbers
        String[] list = scanner.nextLine().split(",");

        // Reading the number of times the list will be rotated;
        int n = scanner.nextInt();

        int[] arrNum = new int[list.length];

        // Filling the arrNum with the parsed integers from list
        for (int i = 0; i < list.length; i++) {
            arrNum[i] = Integer.parseInt(list[i]);
        }

        int[] arrRotated = new int[list.length];


        for (int i = 0; i < n; i++) {
            int index = 1;
            for (int j = 0; j < arrNum.length; j++) {
                arrRotated[list.length - index] = arrNum[j];
                index++;
            }
        }

        for (int i = 0; i < arrRotated.length; i++) {
            System.out.printf("%d ", arrRotated[i]);
        }
    }
}
