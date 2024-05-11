/*
You are very hungry, but there is a problem - there is just too much options and you can only eat one thing. Being a clever programmer, you decide to form objective critera and eat the food with the longest name. Also, why count manually in 30 seconds, when you can spend 15 minutes writing a script to do the counting?

Input
The input consists of at least 2 lines
The last line is always END
Each different food is on a new line
Output
Print the food with the longest name. If two or more foods have equal length, print the last one.
Constraints
1 <= lines of input <= 50 The last line will always be END
*/
import java.util.Scanner;

public class Pack4Task1LongestString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String foodUserInput = "";
        int longestFoodLength = 0;
        String longestWordFood = "";


        //Initializing an infinite loop to read the foods
        while (true) {

            //Gets the food names and measure it's length in characters
            foodUserInput = scanner.nextLine();

            //The loop ends when the user input equals END
            if (foodUserInput.equals("END")) {
                break;
            }

            //Checks if the current word is bigger than then biggest word so far
            if (foodUserInput.length() >= longestFoodLength) {
                longestFoodLength = foodUserInput.length();
                longestWordFood = foodUserInput;
            }

        }

        System.out.println(longestWordFood);
    }
}
