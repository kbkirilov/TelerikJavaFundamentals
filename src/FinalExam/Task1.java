/*
Encoded Messages
Description
Krasi is tasked to invent a program for validating messages. He creates a program which from every message that is received would create a corresponding sequence of encoded characters. That way he would be able to verify the authenticity of the message.

The encoding algorithm will work as described below:

If the word is equal to or longer than 3 characters, the first and the last characters of the word are encoded in a way where we need to provide the next characters in the ASCII table. The part of the word without the first and the last characters are represented as the length of those symbols.
Numbers equal to or longer than 3 digits are also encoded.
If the word / number consists of less than 3 characters it does not change.
White space are passed through as they are.
Example:

Input
1000000 dollar
Output
251 e4s
Explanation:
The first sequence of characters to encode is 1000000. It is equal to or longer than 3 characters hence we need to encode it. We substitute the first character 1 with the next character in the ASCII table which is 2, then substitute the last character 0 with 1 and inbetween we add the length of the rest: 5 so we end up with 251. The second sequence is also equal to or longer than 3 characters. Here d is replaced by e. r is replaced by s and the characters in the middle replaced by their length 4.

Input
The message that the program needs to encode.
Output
The encoded message.
Constraints
Each word will contain only numbers, lowercase or uppercase letters from the English alphabet.
Sample tests
Input
Very secret message to communicate
Output
W2z t4u n5f to d9f
Input
The biggest secret in the world
Output
U1f c5u t4u in u1f x3e
 */

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputMessage = scanner.nextLine().split(" ");
        int wordsInMessage = inputMessage.length;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < inputMessage.length; i++) {
            String currWord = inputMessage[i];

            if (currWord.length() >= 3) {
                char firstChar = currWord.charAt(0);
                char lastChar = currWord.charAt(currWord.length() - 1);

                char firstCharNew = (char) (firstChar + 1);
                char lastCharNew = (char) (lastChar + 1);
                int middleNumber = (currWord.length() - 2);

                result.append(firstCharNew);
                result.append(middleNumber);
                result.append(lastCharNew);

                if (wordsInMessage >= 2 && i != inputMessage.length - 1) {
                    result.append(" ");
                }

            } else {
                result.append(currWord);
                if (wordsInMessage >= 2 && i != inputMessage.length - 1) {
                    result.append(" ");
                }
            }
        }

        System.out.println(result);

    }
}
