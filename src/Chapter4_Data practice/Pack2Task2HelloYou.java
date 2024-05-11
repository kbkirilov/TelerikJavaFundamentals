/*
You want to buy this really cool car from the UK, but you are worried about the fuel consumption. The values you see are MPG (miles per gallon). You have no idea what 20 MPG means so, being a programmer, decide to write a converter that helps you calculate the consumption.

Doing some research, you learn that 1 gallon = 4.54 litres and 1 mile = 1.6 km.

After the calculation, round the result down to the nearest whole number.

Input
On the first line you will receive a number m - miles per gallon
Output
On the only line of output, print {result} litres per 100 km
Constraints
1 <= m <= 100
*/
import java.util.Scanner;

public class Pack2Task2HelloYou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int m = Integer.parseInt(input);

        double galToLiter = 4.54;
        double mileToKm = 1.6;

        double consumption = Math.floor(galToLiter / (m * mileToKm) * 100);

        System.out.printf("%.0f litres per 100 km", consumption);

    }
}
