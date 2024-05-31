/*
Chicken Latin
Even though the Latin is considered dead language there are several variations of it still living in Shakespeare’s plays and programming tasks. I refer to Pig and Dog Latin.

Today we’ll dive into the Chicken Latin. This specific dialect comes from Bulgarian South and the chickens there use "che" instead of "pi”.

To translate one sentence, we need to take in consideration each word in it. The sentence consists of words, separated by only one space. Every word is composed only of lower or uppercase letters.

The rules of Chicken Latin are:

If a word begins with a vowel (a, e, i, o, u or A, E, I, O, U), remove the first letter and append it to the end, then add "che". If you have the word “orange” It translates to “rangeoche”
If a word begins with a consonant (i.e. not a vowel), append "che" to the end of the word. For example, the word "chicken" becomes "chickenche".
If the word has even number of letters append one more "e" to the end of it.
Print the translated sentence.

Input
Read from the standard input:

There is one line of input, a string:
Hello there Amy
Output
Print to the standard output:

One line of output - the translated sentence
Helloche thereche myAche
Constraints
The sentence contains only uppercase, lowercase and spaces. Exactly one space between each word.
1 <= sentence.length <= 150.

 */

import java.util.Scanner;

public class MockExams5Task2ChikenLatin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] sentance = scanner.nextLine().split(" ");
        String che = "che";
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();

        for (int i = 0; i < sentance.length; i++) {
            String currWord = sentance[i];
            if (currWord.charAt(0) == 'a'||
                    currWord.charAt(0) == 'e'||
                    currWord.charAt(0) == 'i' ||
                    currWord.charAt(0) == 'o' ||
                    currWord.charAt(0) == 'u' ||
                    currWord.charAt(0) == 'A'||
                    currWord.charAt(0) == 'E'||
                    currWord.charAt(0) == 'I' ||
                    currWord.charAt(0) == 'O' ||
                    currWord.charAt(0) == 'U') {
                temp.append(currWord);
                temp.append(currWord.charAt(0));
                temp.deleteCharAt(0);
                temp.append(che);
            } else {
                temp.append(currWord + che);
            }

            if (currWord.length() % 2 == 0) {
                temp.append("e");
            }

            result.append(temp + " ");
            temp.setLength(0);
        }

        System.out.println(result.deleteCharAt(result.length() - 1));

    }
}
