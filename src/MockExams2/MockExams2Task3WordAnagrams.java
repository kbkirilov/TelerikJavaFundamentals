/*
Word Anagrams
You are given a word and a list of words. Your task is to check whether all the words from the list are anagrams of the word.

An anagram is a word formed by rearranging the letters of another word:

The following are anagrams of "anagram":
"gramana", "aaagrnm", "margana", etc..
The following are NOT anagrams of "anagram":
"aanagram", "aaagram", "anagra", "anagrama", "yxy"
Input
Read from the standard input

On the first line, find W - the word to check against;
On the second line, find N - the number of words in the list of words WORDS;
On the next N lines, the words from WORDS;
Output
Print to the standard output

For each word from WORDS print either:
"Yes", if the word is an anagram of W;
"No", if the word is NOT an anagram of W;
 */

import java.util.Arrays;
import java.util.Scanner;

public class MockExams2Task3WordAnagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] anagrams = scanner.nextLine().toCharArray();
        Arrays.sort(anagrams);

        int numberOfWords = Integer.parseInt(scanner.nextLine());

        // This will store the answers
        String[] answers = new String[numberOfWords];

        for (int i = 0; i < numberOfWords; i++) {
            char[] word = scanner.nextLine().toCharArray();
            if (word.length != anagrams.length) {
                answers[i] = "No";
                continue;
            }
            Arrays.sort(word);
            boolean areEqual = true;
            for (int j = 0; j < word.length; j++) {
                if (word[j] != anagrams[j]) {
                    answers[i] = "No";
                    areEqual = false;
                    break;
                }
            }
            if (areEqual) {
                answers[i] = "Yes";
            }

        }

        for (String str : answers) {
            System.out.println(str);
        }

    }
}
