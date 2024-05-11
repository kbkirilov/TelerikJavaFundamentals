/*
You have deposited a sum into your bank account for 3 years. The bank has announced an interest of 5% per year. Each time the interest is calculated and added to your deposit. You have to calculate the amount in your deposit for each year.

Input
On the only line you will receive a number (n) with the sum deposited
Output
You should print the amount in your deposit for each of the 3 years
Constraints
You must print the number with two numbers after the decimal point. The rules of math for rounding apply here
*/
import java.util.Scanner;

public class Pack5Task2Interest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double initialDeposit = Double.parseDouble(scanner.nextLine());

        double depositYearOne =  initialDeposit + (initialDeposit * 0.05);
        double depositYearTwo = depositYearOne + (depositYearOne * 0.05);
        double depositYearThree = depositYearTwo + (depositYearTwo * 0.05);

        System.out.printf("%.2f%n%.2f%n%.2f%n", depositYearOne, depositYearTwo, depositYearThree);

    }

}
