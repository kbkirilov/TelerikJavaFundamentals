/*
When you buy something to drink you make a deposit for the bottle. Each bottle has a different deposit. Half liter bottles have $0.1 deposit and the one liter bottles have $0.25 deposit. Calculate the sum which you will make when returning the bottles. You must print two digits after the decimal point.

Input
On the first line you will receive the number of 0.5L bottles.
On the second line you will receive the number of 1L bottles.
Output
You should print the total sum you will earn.
*/
import java.util.Scanner;

public class Pack3Task1BottleDeposit {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Takes the number of bottles I return
        int bottleHalfLiter = Integer.parseInt(userInput.nextLine());
        int bottleLiter = Integer.parseInt(userInput.nextLine());

        double depositHalfLiter = 0.1;
        double depositLiter = 0.25;

        double sumHalfLiter = bottleHalfLiter * depositHalfLiter;
        double sumLiter = bottleLiter * depositLiter;

        double sumTotal = sumLiter + sumHalfLiter;

        System.out.printf("%.2f",sumTotal );

    }

}
