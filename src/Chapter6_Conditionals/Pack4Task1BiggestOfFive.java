/*
Write a program that finds the biggest of 5 numbers, using only 5 if statements.

Input
Read from the standard input.

On the first 5 lines, you will receive the 5 numbers, each on a separate line
Output
Print to the standard output.

Write the biggest of the five numbers on the only output line.
Constraints
The five numbers will always be valid integer numbers in the range [-200, 200]. You do not have to check if they are valid explicitly.
*/
import java.util.Scanner;

public class Pack4Task1BiggestOfFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer num1 = Integer.parseInt(scanner.next());
        Integer num2 = Integer.parseInt(scanner.next());
        Integer num3 = Integer.parseInt(scanner.next());
        Integer num4 = Integer.parseInt(scanner.next());
        Integer num5 = Integer.parseInt(scanner.next());

        if (num1 >= num2 && num1 >= num3 && num1 >= num4 && num1 >= num5) {
            System.out.println(num1);
            return;
        }
        if (num2 >= num3 && num2 >= num4 && num2 >= num5) {
            System.out.println(num2);
            return;
        }
        if (num3 >= num4 && num3 >= num5) {
            System.out.println(num3);
            return;
        }
        if (num4 >= num5) {
            System.out.println(num4);
            return;
        }

        System.out.println(num5);
    }
}
