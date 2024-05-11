/*
Print Company Information
A company has name, address, phone number, fax number, web site and manager. The manager has first name, last name, age and a phone number. Write a program that reads the information about a company and its manager and prints it back on the console.

Input
Read from the standard input

On 9 separate lines you will receive the input
Output
You should print the output on 6 separate lines
Constraints
The input order needs to be changed.
You do not have to change the input content.
*/
import java.util.Scanner;

public class Pack2Task1PrintCompanyInformation {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Company details
        String nameCompany = userInput.nextLine(); // Telerik Academy
        String address = userInput.nextLine(); // 31 Al. Malinov, Sofia
        String phoneNumberCompany = userInput.nextLine(); // +359 888 55 55 555
        String faxNumber = userInput.nextLine(); //
        String website = userInput.nextLine(); // http://telerikacademy.com/

        // Manager details
        String firstName = userInput.nextLine(); // Martin
        String lastName = userInput.nextLine(); // Veshev
        String age = userInput.nextLine(); // 25
        String phoneNumberManager = userInput.nextLine(); // +359 2 981 981

        // Printing
        System.out.printf(nameCompany +
                "%nAddress: " + address +
                "%nTel. " + phoneNumberCompany +
                "%nFax:" +
                "%nWeb site: " + website +
                "%nManager: " + firstName + " " + lastName + " (age: %s, tel. %s)", age, phoneNumberManager);



    }

}
