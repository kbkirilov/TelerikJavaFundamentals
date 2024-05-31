/*
Heaviest Word
The Academy needs you! We have this list of words and we have to find the heaviest one, but we haven't a clue how to approach the problem.

Word heaviness is determined by summing all the letters in it. The letter value corresponds to the position in the English alphabet - where a is 1 and z is 26. For example, the word alpha has a weight of 1 + 12 + 16 + 8 + 1 = 38.
Treat lower- and uppercase letters the same, so a and A both have the value 1.

Your task is to create a program that finds the heaviest word and prints its weight and the word itself to the standart output.

Input
On the first line, N - the number of words to follow.
On the next N lines - a single word.
Output
The heaviest weight and the heaviest word, separated by a space.
Constraints
5 <= N <= 500
3 <= letters in a word <= 20
 */

import java.util.Arrays;
import java.util.Scanner;

public class MockExams5Task3HeaviestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        // Alphabet
        String alphabetAsStr = "qwertyuiopasdfghjklzxcvbnm";
        char[] alphabet =  alphabetAsStr.toCharArray();
        Arrays.sort(alphabet);
        int heaviest = 0;
        String word = "";
        String heaviestWord = "";

        for (int i = 0; i < n; i++) {
            word = scanner.nextLine();
            int tempWeight = 0;

            for (int j = 0; j < word.length(); j++) {
                switch (word.charAt(j)) {
                    case 'a':
                    case 'A':
                        tempWeight += 1;
                        break;
                    case 'b':
                    case 'B':
                        tempWeight += 2;
                        break;
                    case 'c':
                    case 'C':
                        tempWeight += 3;
                        break;
                    case 'd':
                    case 'D':
                        tempWeight += 4;
                        break;
                    case 'e':
                    case 'E':
                        tempWeight += 5;
                        break;
                    case 'f':
                    case 'F':
                        tempWeight += 6;
                        break;
                    case 'g':
                    case 'G':
                        tempWeight += 7;
                        break;
                    case 'h':
                    case 'H':
                        tempWeight += 8;
                        break;
                    case 'i':
                    case 'I':
                        tempWeight += 9;
                        break;
                    case 'j':
                    case 'J':
                        tempWeight += 10;
                        break;
                    case 'k':
                    case 'K':
                        tempWeight += 11;
                        break;
                    case 'l':
                    case 'L':
                        tempWeight += 12;
                        break;
                    case 'm':
                    case 'M':
                        tempWeight += 13;
                        break;
                    case 'n':
                    case 'N':
                        tempWeight += 14;
                        break;
                    case 'o':
                    case 'O':
                        tempWeight += 15;
                        break;
                    case 'p':
                    case 'P':
                        tempWeight += 16;
                        break;
                    case 'q':
                    case 'Q':
                        tempWeight += 17;
                        break;
                    case 'r':
                    case 'R':
                        tempWeight += 18;
                        break;
                    case 's':
                    case 'S':
                        tempWeight += 19;
                        break;
                    case 't':
                    case 'T':
                        tempWeight += 20;
                        break;
                    case 'u':
                    case 'U':
                        tempWeight += 21;
                        break;
                    case 'v':
                    case 'V':
                        tempWeight += 22;
                        break;
                    case 'w':
                    case 'W':
                        tempWeight += 23;
                        break;
                    case 'x':
                    case 'X':
                        tempWeight += 24;
                        break;
                    case 'y':
                    case 'Y':
                        tempWeight += 25;
                        break;
                    case 'z':
                    case 'Z':
                        tempWeight += 26;
                        break;
                }
            }
            if (tempWeight > heaviest) {
                heaviest = tempWeight;
                heaviestWord = word;

            }
        }

        System.out.printf("%d %s", heaviest, heaviestWord);
    }
}
