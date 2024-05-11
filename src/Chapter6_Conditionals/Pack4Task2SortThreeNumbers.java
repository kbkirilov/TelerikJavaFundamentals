/*
Write a program that enters 3 numbers and prints them sorted in descending order.

Use nested if statements.
Don’t use arrays and the built-in sorting functionality.
Input
On the first three lines, you will receive the three numbers, each on a separate line.
Output
Output a single line on the console - the sorted numbers, separated by a white space
Constraints
The three numbers will always be valid integer numbers in the range [-1000, 1000]
*/
import java.util.Scanner;

public class Pack4Task2SortThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer num1 = Integer.parseInt(scanner.next());
        Integer num2 = Integer.parseInt(scanner.next());
        Integer num3 = Integer.parseInt(scanner.next());

        int greatestNumber = 0;
        int middleNumber = 0;
        int lowestNumber = 0;

        // I am finding the greatest number
        if (num1 >= num2 && num1 >= num3) {
            greatestNumber = num1;
            if (num2>num3) {
                middleNumber = num2;
                lowestNumber = num3;
            } else {
                middleNumber = num3;
                lowestNumber = num2;
            }
        } else if (num2 >= num3) {
            greatestNumber = num2;
            if (num3 >= num1){
                middleNumber = num3;
                lowestNumber = num1;
            } else {
                middleNumber = num1;
                lowestNumber = num3;
            }
        } else {
            greatestNumber = num3;
            if (num1 >= num2) {
                middleNumber = num1;
                lowestNumber = num2;
            } else {
                middleNumber = num2;
                lowestNumber = num1;
            }
        }

        System.out.printf("%d %d %d", greatestNumber, middleNumber, lowestNumber);

    }
}
