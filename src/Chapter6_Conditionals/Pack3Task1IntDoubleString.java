/*
Write a program that, depending on the first line of the input, reads an int, double or string variable.

If the variable is int or double, the program increases it by one.
If the variable is a string, the program appends * at the end.
Print the result at the console.
Input
On the first line you will receive the type of input as a string in the following form:
integer for int
real for double
text for string
On the second line you will be given the value of the variable.
Output
Write a single line on the console - the value transformed according to the rules from the description.
Print all double variables with exactly 2-digit precision after the floating point. Example: 0.99
Constraints
The input will always be valid and in the described format.
All input numbers will be between -1000 and 1000.
*/
import java.util.Scanner;

public class Pack3Task1IntDoubleString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        switch (input) {
            case "integer":
                int valuetoInt = Integer.parseInt(scanner.nextLine());
                System.out.println(valuetoInt + 1);
                break;
            case "real":
                double valueToDouble = Double.parseDouble(scanner.nextLine());
                System.out.printf("%.2f", valueToDouble + 1);
                break;
            case "text":
                String text = scanner.nextLine();
                System.out.println(text + "*");
                break;
        }

    }

}
