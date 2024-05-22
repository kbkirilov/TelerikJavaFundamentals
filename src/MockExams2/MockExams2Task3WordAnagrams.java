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

import java.util.Scanner;

public class MockExams2Task3WordAnagrams {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String subjWord = scanner.nextLine();
        String[] arrSubjWord = subjWord.split("");
        int subjWordLength = subjWord.length();

        String currWord = "";
        int currWordLength = 0;

        // This is used to get each character in the sub word
        String charOfSub = "";

        // How many words we will have the arrWords
        int numberWord = Integer.parseInt(scanner.nextLine());

        String[] arrWords = new String[numberWord];

        // Filling the arrWords array with words
        for (int i = 0; i < numberWord; i++) {
            arrWords[i] = scanner.nextLine();
        }

        for (int i = 0; i < numberWord; i++) {

            currWord = arrWords[i];
            currWordLength = arrWords[i].length();


            // If the length is smaller than the subject word it's a no
            if (currWordLength != subjWordLength) {
                System.out.println("No");
                continue;
            } else {
                for (int j = 0; j < subjWordLength; j++) {

                    charOfSub = Character.toString(subjWord.charAt(j));

                    if (!currWord.contains(charOfSub)) {
                        System.out.println("No");
                        continue;
                    }
                }
            }
            System.out.println("Yes");
        }
    }
}
