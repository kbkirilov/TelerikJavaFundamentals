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

        // Read the number of queries
        int N = scanner.nextInt();
        scanner.nextLine(); // consume the newline after the integer input

        // Process each query
        for (int i = 0; i < N; i++) {
            String query = scanner.nextLine();
            StringBuilder sb = new StringBuilder(title);
            int titleIndex = 0;
            int queryIndex = 0;

            // Try to find the query in the title
            while (titleIndex < sb.length() && queryIndex < query.length()) {
                if (sb.charAt(titleIndex) == query.charAt(queryIndex)) {
                    queryIndex++;
                }
                titleIndex++;
            }

            // If the entire query was found
            if (queryIndex == query.length()) {
                titleIndex = 0;
                queryIndex = 0;

                // Remove the characters of the query from the title
                while (queryIndex < query.length()) {
                    if (sb.charAt(titleIndex) == query.charAt(queryIndex)) {
                        sb.deleteCharAt(titleIndex);
                        queryIndex++;
                    } else {
                        titleIndex++;
                    }
                }
                title = sb.toString();  // Update title with the new string
                System.out.println(title);
            } else {
                // If the query could not be found in the title
                System.out.println("No such title found!");
            }
        }

        scanner.close();
    }
}
