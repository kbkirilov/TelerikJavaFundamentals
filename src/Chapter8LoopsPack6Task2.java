import java.util.Scanner;

public class Chapter8LoopsPack6Task2 {
    public static void main(String[] args) {
        // The scanner is used to read input
        Scanner scanner = new Scanner(System.in);

        //Number of lines to read
        int n = scanner.nextInt();

        //Declare the number variable to store the sum of every number from the input
        int result = 0;

        //Variable allWords to concatenate the words
        String allWords = "";

        //Keep track of how many words do we have
        int countWords = 0;

        //Declare the string;
        StringBuilder baseStringBuilder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            //Input as string
            String input = scanner.next();

            //Saving the first character of the input.
            char sign = input.charAt(0);

            //Check if the input is a number
            if ((sign >= 'a' && sign <= 'z') || (sign >= 'A' && sign <= 'Z')) {
                allWords = allWords + input + "-";
                countWords++;
            }
            if (sign >= '0' && sign <= '9') {
                result += Integer.parseInt(input);
            }
        }

        if (countWords > 0) {
            System.out.println(allWords.substring(0, allWords.length() - 1));
            System.out.println(result);
        } else {
            System.out.println("no words");
            System.out.println(result);
        }
    }
}