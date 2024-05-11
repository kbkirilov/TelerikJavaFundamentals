/*
Write a program that reads a four-digit number and displays the sum of its digits

1213 => 1 + 2 + 1 + 3 = 7
2346 => 2 + 3 + 4 + 6 = 15
Input
On the first line, you will receive the four-digit number N
Output
On the only line of output, print the sum of digits
Constraints
1000 <= N <= 9999
*/
import java.util.Scanner;

public class Pack5Task4SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.next();

        char firstCharacter = n.charAt(0);
        char secondCharacter = n.charAt(1);
        char thirdCharacter = n.charAt(2);
        char fourthCharacter = n.charAt(3);

        int number1 = Character.getNumericValue(firstCharacter);
        int number2 = Character.getNumericValue(secondCharacter);
        int number3 = Character.getNumericValue(thirdCharacter);
        int number4 = Character.getNumericValue(fourthCharacter);

        int sumAll = number1 + number2 + number3 + number4;

        System.out.println(sumAll);

    }

}
