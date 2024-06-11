/*
Longest Palindrome Pair
In a list of words, find the pair of words that form a palindrome with the best length.

A palindrome pair is formed by two words that read the same way backwards.

race car -> length 7
live evil -> length 8
Input
Read from the standard input:

On the first line, you receive the words, separated by a space.
Output
Print on the standard output:

Print the best length found, or 0 if no pairs can be formed.
Constraints
Each word will consist of a-z characters only
2 <= total words <= 20
Sample Tests
Input
race live car evil
Output
8
Input
alpha java android
Output
0
 */

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        // Used to update the index of the next word in words
        StringBuilder tempPairWord = new StringBuilder();
        int longestLength = 0;

        // Checking for current word and the next
        for (int i = 0; i < words.length ; i++) {
            int index = i + 1;
            String currWord = words[i];

            // Check the words after the currWord
            for (int j = index; j < words.length; j++) {
                String nextWord = words[j];

                tempPairWord.append(currWord);
                tempPairWord.append(nextWord);

                // Making a char array from the word pair
                char[] currWordPair = String.valueOf(tempPairWord).toCharArray();

                // Check if the word is palindrome or not
                for (int k = 0; k < currWordPair.length / 2; k++) {
                    int temp = 0;
                    char startChar = currWordPair[k];
                    char endChar = currWordPair[currWordPair.length - k -1];
                    
                    if (startChar != endChar) {
                        break;
                    } 
                    if (k == (currWordPair.length / 2) - 1) {
                        temp = currWordPair.length;
                        if (temp > longestLength) {
                            longestLength = temp;
                        }
                    }

                }

                tempPairWord.setLength(0);
                index++;

            }
        }
        System.out.println(longestLength);
    }
}
