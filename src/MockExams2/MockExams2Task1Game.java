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

        // Reads the number as string
        String[] number = scanner.nextLine().split("");

        ArrayList<Integer> results = new ArrayList<>();

        int biggestNumber = Integer.MIN_VALUE;

        // Get the digits of the number in an int variable
        int d1 = Integer.parseInt(number[0]);
        int d2 = Integer.parseInt(number[1]);
        int d3 = Integer.parseInt(number[2]);

        // Possible scenarios;
        int plus = d1 + d2 + d3;
        results.add(plus);
        int multiply1 = d1 * d2 * d3;
        results.add(multiply1);
        int multiply2 = d1 * d2 + d3;
        results.add(multiply2);
        int multiply3 = d1 + d2 * d3;
        results.add(multiply3);

        for (int s : results) {
            if (s > biggestNumber) {
                biggestNumber = s;
            }
        }

        System.out.println(biggestNumber);

    }
}
