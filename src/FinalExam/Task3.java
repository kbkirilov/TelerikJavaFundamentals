/*
Write a program that accepts a list of words and prints the ones that can be typed out using only one row of letters from the keyboard (i.e. consisting of letters, found on the same row). Here are the letters from each row:

Top row: q, w, e, r, t, y, u, i, o, p
Middle row: a, s, d, f, g, h, j, k, l
Bottom row: z, x, c, v, b, n, m
Standard American Keyboard Layout Image

Input
The input data should be read from the console.

On the first and only line are the words, all on one line, separated by a comma and space ", ";
Output
Print to the console every word that can be typed using only letters from a single row of the keyboard.
Print them in the order of appearance (no order/sorting);
Separate each word with a comma and space (", ");
Constraints
Input will consist of letters only;
You can use one letter more than once per word (e.g. aaa is valid);
There is no constraint on upper/lower case letters (e.g. Apple and apple are the same words);
Sample tests
Input
My, Keyboard, Is, Broken, Sorry, Maybe, I, Shall, Try, A, Typewriter
Output
I, Shall, Try, A, Typewriter
Input
Qwerty, Telerik, Potter, Harry, Queue
Output
Qwerty, Potter, Queue
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputWords = scanner.nextLine().split(", ");
        ArrayList<String> result = new ArrayList<>();

        String topRow = "qwertyuiop";
        String middleRow = "asdfghjkl";
        String bottomRow = "zxcvbnm";

        for (int i = 0; i < inputWords.length; i++) {
            String currWord = inputWords[i];
            int currWordLength = currWord.length();
            int topRowLength = 0;
            int middleRowLength = 0;
            int bottomRowLength = 0;

            for (int j = 0; j < currWord.length(); j++) {
                String currChar = String.valueOf(currWord.charAt(j));
                // Checks the top row
                if (topRow.contains(currChar) ||
                topRow.toUpperCase().contains(currChar)) {
                    topRowLength++;
                } else if (middleRow.contains(currChar) ||
                middleRow.toUpperCase().contains(currChar)) {
                    middleRowLength++;
                } else {
                    bottomRowLength++;
                }
            }

            if (topRowLength == currWordLength ||
            middleRowLength == currWordLength ||
            bottomRowLength == currWordLength) {
                result.add(currWord);
            }
        }

        for (String s : result) {
            System.out.print(s);
            if (!s.equals(result.get(result.size() - 1))) {
                System.out.print(", ");
            }
        }
    }
}
