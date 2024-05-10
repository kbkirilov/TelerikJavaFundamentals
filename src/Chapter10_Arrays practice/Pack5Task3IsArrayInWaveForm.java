/*
Description
Write a program that determines if an array of integers is in Wave Form

Input
On a single line you will receive numbers separated by space

Output
Print "yes" if the array is in Wave Form - e.g. first > second < third > fourth < fifth >
Print "no" if the array is not in Wave Form

Constraints
The input will consist of valid integer numbers

 */


import java.util.Scanner;

public class Pack5Task3IsArrayInWaveForm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the input
        String[] numbers = scanner.nextLine().split(" ");

        String isTrue = "yes";

        for (int i = 0; i < numbers.length - 1; i++) {

            int current = Integer.parseInt(numbers[i]);
            int next = Integer.parseInt(numbers[i+ 1]);

            if (i == 0 ) {
                if (current > next) {
                    continue;
                } else {
                    isTrue = "no";
                    break;
                }
            } else if (i == 1) {
                if (current < next) {
                    continue;
                } else {
                    isTrue = "no";
                    break;
                }
            } else if (i % 2 == 0) {
                if (current > next) {
                    continue;
                } else {
                    isTrue = "no";
                    break;
                }
            } else if (i % 2 == 1) {
                if (current < next) {
                    continue;
                } else {
                    isTrue = "no";
                    break;
                }
            }
        }

        System.out.println(isTrue);

    }
}
