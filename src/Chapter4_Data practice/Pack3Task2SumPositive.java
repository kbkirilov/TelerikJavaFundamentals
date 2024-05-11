/*
Write a program that reads a positive integer (n) You must print the sum of all integers from 1 to n.

Hint
You could use the formula sum = n*(n+1)/2
Input
On the first line you will receive a number (n)
Output
You should print the sum of the integers from 1 to n
*/
import java.util.Scanner;

public class Pack3Task2SumPositive {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int n = Integer.parseInt(userInput.next());

        int sum = n*(n+1)/2;

        System.out.print(sum);

    }

}
