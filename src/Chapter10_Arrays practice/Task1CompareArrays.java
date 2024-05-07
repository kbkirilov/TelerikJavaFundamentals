/* Write a program that reads and compares two int arrays.

Input
On the first line, you will receive the number N
On the next N lines, the numbers of the first array will be given
On the next N lines, the numbers of the second array will be given

Output
Print "equal" if the two arrays are the same and "not equal" if they are not

Constraints
Both arrays will consist of valid integer numbers and will have the same size
 */

import java.util.Scanner;

public class Task1CompareArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // The number of elements each array will have
        int n = scanner.nextInt();


        // Declaring array1 and array2
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];


        // Assigning values to the elements in the array1 and array2
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }

        // I will write the result in this string
        String result = "equal";

        //Checking if the elements are equal
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                result = "not equal";
                break;
            }
        }

        // Print the result
        System.out.println(result);


    }
}
