/*
You are given some arrays of numbers. Your task is to check if they are symmetric. A symmetric array is one, where the element at index x is equal to the element at index array.length - 1 - x.

Input
Read from the standard input.

On the first line, read the number N - the number of arrays to follow.
On the N lines, read the elements of each array, separated by white space.

Output
Print to the standard output.

For each of the arrays, print Yes of the array is symmetric, or No if it's not.
 */


import java.util.Scanner;

public class Pack5Task2SymmetricArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // This says how many lists we will get later
        int lines = Integer.parseInt(scanner.nextLine());

        // Loops through all the lines of input we have
        for (int i = 0; i < lines; i++) {

            // Reads the list elements from the console
            String[] list = scanner.nextLine().split(" ");

            String checkResult = "Yes";

            int x = 0;

            for (int j = 0; j < list.length; j++) {
                if (list[x].equals(list[list.length - 1 - x])) {
                    checkResult = "Yes";
                    x++;
                } else {
                    checkResult = "No";
                }
            }

        System.out.println(checkResult);

        }
    }
}
