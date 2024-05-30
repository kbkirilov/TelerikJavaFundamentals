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

import java.util.ArrayList;
import java.util.Scanner;

public class MockExams2Task1Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        int first = input / 100;
        int middle = (input / 10) % 10;
        int last = input % 10;


        int biggest = first + middle + last;
        int currentExpression = first * middle * last;

        if (currentExpression > biggest) {
            biggest = currentExpression;
        }

        currentExpression = first + middle * last;
        if (currentExpression > biggest) {
            biggest = currentExpression;
        }

        currentExpression = first * middle + last;
        if (currentExpression > biggest) {
            biggest = currentExpression;
        }

        System.out.println(biggest);

    }
}
