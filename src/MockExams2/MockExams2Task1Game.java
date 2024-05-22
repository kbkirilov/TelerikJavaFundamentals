/*
Game
Three friends came up with a game for having fun in the break between the classes. One of them says a three-digit number and the others use it to form a mathematical expressions by using operators for sum and multiplication between the digits.

The winner is the first one who founds the biggest number that is a result of the above mentioned rules.

Write a program 'game', which prints out that biggest number.

Input
Read from the standard input

The first line of the input will be positive three-digit number N.
Output
Print on the standard output

The result should be the calculated biggest number.
The calculation order
 */

import java.util.Scanner;

public class MockExams2Task1Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Reads the number as string
        String[] number = scanner.nextLine().split("");

        int biggestNumber = 0;

        // Get the digits of the number in an int variable
        int digit1 = Integer.parseInt(number[0]);
        int digit2 = Integer.parseInt(number[1]);
        int digit3 = Integer.parseInt(number[2]);

        int multiply = ((digit1 * digit3) * digit2) + digit1;

        System.out.println(multiply);

    }
}
