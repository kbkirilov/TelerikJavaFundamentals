/*
Write a program that displays the name of the season associated with a given date and month. Use the table below to determine the season's start and end dates.

Season	Start Date
Spring	March 20
Summer	June 21
Autumn	September 22
Winter	December 21
For example, Autumn lasts from September 22 to December 20, both inclusive.

Input
On the first line, you will receive the month as a string
On the second line, you will receive the date as a number
Output
On the only line of output, print the name of the season in pascal case
*/
import java.util.Scanner;

public class Pack2Task1GuessTheSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String monthName = scanner.nextLine();
        int day = scanner.nextInt();

        if (monthName.equals("March") && day >= 20) {
            System.out.println("Spring");
        } else if (monthName.equals("June") && day <= 20) {
            System.out.println("Spring");
        } else if (monthName.equals("April") || monthName.equals("May")) {
            System.out.println("Spring");
        }

        if (monthName.equals("June") && day >= 21) {
            System.out.println("Summer");
        } else if (monthName.equals("September") && day <= 21) {
            System.out.println("Summer");
        } else if (monthName.equals("July") || monthName.equals("August")) {
            System.out.println("Summer");
        }

        if (monthName.equals("September") && day >= 22) {
            System.out.println("Autumn");
        } else if (monthName.equals("December") && day <= 20) {
            System.out.println("Autumn");
        } else if (monthName.equals("October") || monthName.equals("November")) {
            System.out.println("Autumn");
        }

        if (monthName.equals("December") && day >= 21) {
            System.out.println("Winter");
        } else if (monthName.equals("March") && day <= 19) {
            System.out.println("Winter");
        } else if (monthName.equals("January") || monthName.equals("February")) {
            System.out.println("Winter");
        }

    }

}
