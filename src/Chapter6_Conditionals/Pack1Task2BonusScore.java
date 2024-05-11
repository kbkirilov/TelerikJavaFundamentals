/*
Write a program that applies bonus score to given score in the range [1…9] by the following rules:

If the score is between 1 and 3, the program multiplies it by 10.
If the score is between 4 and 6, the program multiplies it by 100.
If the score is between 7 and 9, the program multiplies it by 1000.
If the score is less than or equal to 0 or more than 9, the program prints "invalid score".
Input
The only input line will contain one integer number - the score
Output
Output the score with the applied bonus
*/
import java.util.Scanner;

public class Pack1Task2BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score = scanner.nextInt();

        if (score >=1 && score <= 3) {
            score = score * 10;
        } else if (score >=4 && score <= 6) {
            score = score * 100;
        } else if (score >=7 && score <= 9) {
            score = score * 1000;
        } else {
            System.out.println("invalid score");
            return;
        }

        System.out.println(score);

    }

}
