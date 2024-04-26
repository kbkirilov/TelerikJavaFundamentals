import java.util.Scanner;

public class HelloTelerikAcademy {
    public static void main(String[] args) {
        // The scanner is used to read input
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        //Declare the number variable to store the sum of every number from the input
        int result = 0;

        //Declare the string;
        String empty = "no words";

        for (int i = 0; i < n; i++) {
            //Number or a word
            String input = scanner.next();

            //Check if the input is a number
            if (Character.isDigit(input.charAt(0))) {
                int number;
                number = Integer.parseInt(input);
                result += number;
            } else {

            }

        }

        //Print the output
        System.out.println(empty);
        System.out.println(result);
    }
}