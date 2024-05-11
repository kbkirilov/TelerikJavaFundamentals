/*
Given N numbers, write a program that checks whether the product of the elements on odd indexes is equal to the product of the elements on even indexes. The first element is at index 1, the second element is at index 2 and so on.

Input
On the first line you will receive the number N.
On the second line you will receive N numbers, separated by whitespace.
Output
If the two products are equal, print a string in the format "yes PRODUCT_VALUE".
If they are not equal, print "no ODD_PRODUCT_VALUE EVEN_PRODUCT_VALUE".
Constraints
N will always be a valid integer number in the range [4, 50].
All numbers from the second line will also be positive and valid.
*/
import java.util.Scanner;

public class Pack1Task3OddOrEvenProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        int productOddLines = 1;

        int productEvenLines = 1;


        for (int i = 1; i <= lines; i++) {

            int number = Integer.parseInt(scanner.nextLine());

            if (i % 2 != 0) {

                productOddLines *= number;
            } else {

                productEvenLines *= number;
            }
        }


        if (productOddLines == productEvenLines) {
            System.out.printf("yes %d%n", productOddLines);
        } else {
            System.out.printf("no %d %d%n", productOddLines, productEvenLines);
        }
    }
}
