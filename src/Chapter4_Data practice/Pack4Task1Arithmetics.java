/*
Read two numbers from the console and calculate:

The sum of a and b
The difference when b is subtracted from a
The product of a and b
The remainder when a is divided by b
The result of a powered to b
Input
On the first line you will receive a number a
On the second line you will receive a number b
Output
You should print the sum, the difference, the product the remainder and the power
*/
import java.util.Scanner;

public class Pack4Task1Arithmetics {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        int numberA = userInput.nextInt();
        int numberB = userInput.nextInt();

        int sum = numberA + numberB;
        int substract = numberA - numberB;
        int product = numberA * numberB;
        int remainder = numberA % numberB;
        int power = (int) Math.pow(numberA, numberB);

        System.out.println(sum);
        System.out.println(substract);
        System.out.println(product);
        System.out.println(remainder);
        System.out.println(power);

    }

}
