/*
Title Search
You will receive a string title which contains only small latin letters [a-z]. After that you will have to read from the input N lines of text. For each of these lines, your task is to find out if there is such a sequence in the string you receive as input on the first line (title). The sequence may not be on consecutive indices. Each time you find a sequence of these characters you remove it from the initial string and print the modified string. If no such sequence is found you have to print No such title found! and not modify the string.

Examples:
telerik is found in telerikacademy and the remaining string is academy
telerik is also found in tpeplpeprik and the remaining string is pppp
Input
Read from the standard input
On the first line you receive a string containing small latin letters [a-z]
On the next line you receive an integer N which represents the number of lines which you will have to read
On each of the next N lines you receive a string
Output
Print on the standard output
On every N line, print the result of the operation
Examine the sample tests for explanation
Constraints
3 <= N <= 10
200 <= title.length() <= 5000

 */

import java.util.ArrayList;
import java.util.Scanner;

public class MockExams4Task3TitleSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the title string
        String title = scanner.nextLine();

        StringBuilder titleAsSb = new StringBuilder(title);

        // The number of lines of text to follow
        int n = Integer.parseInt(scanner.nextLine());

        // Declaring a String array to store the text in the next n lines
        String[] all = new String[n];

        // The remaining strings are stored in an ArrayList each time after
        // all the characters from the current target element are checked
        ArrayList<String> result = new ArrayList<>();

        // Is the titleAsSb modified
        boolean isModified = false;

        String noTitleFounds = "No such title found!";

        // Fills the all array with the string on the n lines
        for (int i = 0; i < n; i++) {
            all[i] = scanner.nextLine();
        }


        String currStr = "";
        char currCharTarget = '0';
        char currCharTitle = '0';
        int index = 0;
        int toK = 0;

        for (int i = 0; i < all.length; i++) {

            // The current element in the all String array
            currStr = all[i];

            // For every character in the currStr String
            for (int j = 0; j < currStr.length() ; j++) {

                // Resets the isModified variable
                isModified = false;

                currCharTarget = currStr.charAt(j);

                // Loops through each character in the titleAsSb String
                for (int k = index; k < titleAsSb.length(); k++) {
                    
                    currCharTitle = titleAsSb.charAt(index);

                    // If the index j char of the first string equals any of the
                    // remaining characters in titleAsSb
                    if (currCharTarget == currCharTitle) {
                        isModified = true;
                        // Deletes the character at that place
                        titleAsSb.deleteCharAt(k);
                        break;
                    } else {
                        index++;
                    }

                }

            }

            index = 0;

            if (isModified) {
                result.add(titleAsSb.toString());
            } else {
                result.add("No such title found!");
            }

        }

        for (String s : result) {
            System.out.println(s);
        }

    }
}
