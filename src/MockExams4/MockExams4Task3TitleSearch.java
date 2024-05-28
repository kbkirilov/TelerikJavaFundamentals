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

        // Reading the title word
        String title = scanner.nextLine();

        // String builder to store the modified string ONLY IF
        // all the characters from the checkWord
        // are present in the title word
        StringBuilder titleAsSb = new StringBuilder(title);

        // The number of lines of text to follow
        int n = Integer.parseInt(scanner.nextLine());

        // Is the titleAsSb modified
        boolean isContained = false;

        // Check the array of words
        for (int k = 0; k < n; k++) {

            String checkWord = scanner.nextLine();

            // Check each letter from the checkWord
            for (int i = 0; i < checkWord.length(); i++) {

                int currCharInCheck = checkWord.charAt(i);

                for (int j = 0; j < title.length(); j++) {
                    int currCharInTitle = title.charAt(j);

                    if (currCharInCheck == currCharInTitle && titleAsSb.charAt(j) != '0') {
                        isContained = true;
                        titleAsSb.setCharAt(j, '0');
                        break;
                    } else if (j == title.length() - 1) {
                        if (currCharInCheck == currCharInTitle) {
                            titleAsSb.setCharAt(j, '0');
                            isContained = true;
                            break;
                        } else {
                            break;
                        }
                    }
                    isContained = false;
                }
            }

            if (isContained == true) {
                for (int i = 0; i < titleAsSb.length(); i++) {
                    if (titleAsSb.charAt(i) == '0') {
                        titleAsSb.deleteCharAt(i);
                        i--;
                    }
                }
                System.out.println(titleAsSb);
                title = titleAsSb.toString();
            } else {
                titleAsSb.setLength(0);
                titleAsSb.append(title);
                System.out.println("No such title found!");
            }
        }
    }
}
