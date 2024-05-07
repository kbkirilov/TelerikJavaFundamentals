import java.util.Scanner;

public class DemoTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Reading the array as strings
        String[] input = scanner.nextLine().split(",");

        // All the string that are not found in the array
        String missing = "";

        //Iterating over all the numbers
        for (int currentNumber = 1; currentNumber <= input.length; currentNumber++) {
            boolean isFound = false;


            for (String number : input) {
                if (currentNumber == Integer.parseInt(number)) {
                    isFound = true;
                    break;
                }
            }

            //Adding a "," if we have more than one missing number
            if (!isFound) {
                if (missing.length() > 0) {
                    missing += ",";
                }

                missing += currentNumber;
            }
        }

        //Printing the missing numbers
        System.out.println(missing);

    }
}
