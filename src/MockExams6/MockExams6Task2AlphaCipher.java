/*
The Alpha Cipher is a very advanced cryptography algorithm, designed for a top secret project. You are tasked with it's implementation, because it proved too difficult for the experts at the government.

The Cipher is very advanced. Here is how you can calculate it:

You get 5 numbers that consist of 3 digits each.
Then, you need to find the product of those digits (multiply them with one another).
If the result consists of more than 1 digit, take only the last digit of the produced number.
For example, we have the following input:

111
222
333
444
555
We multiply each of the digits and take only the last digit of the produced number:

1 * 1 * 1 = 1
2 * 2 * 2 = 8
3 * 3 * 3 = 2 7
4 * 4 * 4 = 6 4
5 * 5 * 5 = 12 5
Then we print out the produced Alpha Cipher: 18745

Input
The input data is read from the standard input (the console).

You will get 5 numbers on 5 separate lines.
Output
The output data is printed on the standard output (the console).

The output consists of one line on which you should print out the produced Alpha Cipher.
Constraints
Each number is positive and consists of exactly 3 digits.
Each digit is in the range of 1 to 9, inclusive.
 */


import java.util.Scanner;

public class MockExams6Task2AlphaCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder alphaCipher = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            String num = scanner.nextLine();
            int result = 0;
            String resultAsString = "";

            result = Integer.parseInt(String.valueOf(num.charAt(0))) *
                    Integer.parseInt(String.valueOf(num.charAt(1))) *
                    Integer.parseInt(String.valueOf(num.charAt(2)));

            resultAsString = String.valueOf(result);

            if (result >= 10) {
                alphaCipher.append(resultAsString.charAt(resultAsString.length() - 1));
            } else {
                alphaCipher.append(resultAsString);
            }

        }

        System.out.println(alphaCipher);
    }
}
