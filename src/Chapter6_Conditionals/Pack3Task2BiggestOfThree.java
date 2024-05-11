/*
Write a program that finds the biggest of three numbers.

Input
Read from the standard input.

On the first three lines you will receive the three numbers, each on a separate line.
Output
Print to the standard output.

On the only output line, write the biggest of the three numbers.
Constraints
The three numbers will always be valid integer numbers in the range [-200, 200]. You do not have to explicitly check if they are valid.
*/
import java.util.Scanner;

public class Pack3Task2BiggestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numb1 = Integer.parseInt(scanner.next());
        int numb2 = Integer.parseInt(scanner.next());
        int numb3 = Integer.parseInt(scanner.next());

        if (numb1 > numb2) {
            if (numb1 > numb3) {
                System.out.println(numb1);
            } else {
                System.out.println(numb3);
            }
        } else {
            if (numb2 > numb3) {
                System.out.println(numb2);
            } else {
                System.out.println(numb3);
            }
        }

    }

}
