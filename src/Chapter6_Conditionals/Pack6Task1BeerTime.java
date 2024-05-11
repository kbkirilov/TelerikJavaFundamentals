/*
Description
A beer time is after 1:00 PM (incl.) and before 3:00 AM (excl.)

Write a program that accepts a time and then prints beer time or non-beer time according to the definition above or invalid time if the time cannot be parsed

Hint: Research sub-string functions for string data type.

Input
On a single line you will receive time in the format “hh:mm tt” (an hour in range [01...12], a minute in range [00…59], and AM / PM designator)
Output
Print "beer time", "non-beer time" or "invalid time"
*/
import java.util.Scanner;

public class Pack6Task1BeerTime {
    public static void main(String[] args) {
        // Read input
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String pmAmDesignator = "";
        // Set default values
        int hour = 0;
        int minutes = 0;

        // Begin of validation
        // First validate the length
        if (input.length() < 7 || input.length() > 8) {
            System.out.println("invalid time");
            // If validation fails the program ends its execution
            return;
        }

        // If the hour is single digit add "0" in the beginning
        if (input.length() == 7){
            input = 0 + input;
        }

        // Create temporary variables for better readability
        // they will be used for the hours and minutes
        int zeroAscii = (int) '0';
        int fiveAscii = (int) '5';
        int nineAscii = (int) '9';

        // Second validate all characters types
        // by comparing their ascii values
        // (!hint search for the ascii table)
        if ((input.charAt(0) != '0' && input.charAt(0) != '1') ||
                input.charAt(1) < zeroAscii || input.charAt(1) > nineAscii ||
                input.charAt(2) != ':' ||
                input.charAt(3) < zeroAscii || input.charAt(3) > fiveAscii ||
                input.charAt(4) < zeroAscii || input.charAt(4) > nineAscii ||
                input.charAt(5) != ' ' ||
                input.charAt(6) != 'P' && input.charAt(6) != 'A' ||
                input.charAt(7) != 'M'
        ) {
            System.out.println("invalid time");
            // If validation fails the program ends its execution
            return;
        }

        // Depending on the value of the first hour digit
        if (input.charAt(0) == '0') {
            // Only the second digit is parsed
            hour = Integer.parseInt(String.valueOf(input.charAt(1)));
        } else {
            // Both digits are parsed
            hour = Integer.parseInt(input.substring(0, 2));
        }

        // Minutes are always two digits
        //The default value of minutes is replaced
        minutes = Integer.parseInt(input.substring(3, 4));
        // Third validate the hour
        if (hour < 1 || hour > 12 || minutes > 59){
            System.out.println("invalid time");
            // If validation fails the program ends its execution
            return;
        }
        // Store the designator for better readability
        pmAmDesignator = input.substring(6, 8);
        // Depending on the designator make the comparison
        // if it is "PM", all hours from 1 to 11 (incl.) are "beer time"
        if (pmAmDesignator.equals("PM") && hour < 12 ||
                // if it is "AM", from midnight to 12:59 (incl.) is "beer time"
                pmAmDesignator.equals("AM") && hour == 12 ||
                // if it is "AM", all hours from 1 to 2 (incl.) are "beer time"
                pmAmDesignator.equals("AM") && hour < 3) {
            System.out.println("beer time");
        } else {
            System.out.println("non-beer time");
        }
    }
}
