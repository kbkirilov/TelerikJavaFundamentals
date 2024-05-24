import java.util.ArrayList;
import java.util.Scanner;

public class CapturingRainwater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the pillars height  " +
                "separated with a single indentation: ");
        String[] arrAsString = scanner.nextLine().split(" ");

        int[] arr = new int[arrAsString.length];

        // Fills the array with the parsed numbers from arrAsString
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(arrAsString[i]);
        }

        // Largest element in the array;
        int largestElement = Integer.MIN_VALUE;

        // Find the largest element in the array
        for (int n : arr) {
            if (n > largestElement) {
                largestElement = n;
            }
        }

        // This is used to update the index of each element in the arr
        // array when printing each row.
        int index = 0;
        // Max number of lines to print:
        int lines = largestElement;
        // water amount
        int water = 0;
        int currWater = 0;
        // This will store the index position of the stars in each element in
        // the arrWaterNotFilled array
        ArrayList<Integer> arrStarsIndex = new ArrayList<>();

        int lineBelow = lines;
        int rows = lines + 1;

        // This will store the histogram in an array
        String[] arrWaterNotFilled = new String[rows];

        // This will store each row from the histogram as String, which
        // will be appended to the arrWaterNotFilled array
        StringBuffer sb = new StringBuffer();

        System.out.println("This is the histogram before filling it with water:\n");
        // Prints the content of each of the lines
        // Prints the histogram towers (without the water)
        for (int i = 0; i <= lines; i++) {

            // Prints the contents of each row in the histogram
            for (int j = 0; j < arr.length; j++) {
                // Checks whether it should print a "*" or a " "
                if (lineBelow <= arr[index]) {
                    System.out.print("* ");
                    sb.append("*");
                } else {
                    System.out.print("  ");
                    sb.append("0");
                }
                index++;
            }

            System.out.println();

            // Add the contents of the latest printed row as Strings
            // in the arrWaterNotFilled
            arrWaterNotFilled[i] = sb.toString();

            // Reset the string builder
            sb.setLength(0);

            // Resets the values
            index = 0;
            lineBelow--;
        }

        // Calculates the water that the histogram can hold
        for (int i = 0; i < arrWaterNotFilled.length; i++) {

            // The current element is arrWaterNotFilled
            String currElement = arrWaterNotFilled[i];

            // Find the index position of each "*" and fills them in the
            // arrStarsIndex array list
            for (int j = 0; j < currElement.length(); j++) {
                if (currElement.charAt(j) == '*') {
                    arrStarsIndex.add(j);
                }
            }

            // Calculates the empty spaces between the stars using their index position
            for (int k = 0; k < arrStarsIndex.size() - 1; k++) {
                currWater = arrStarsIndex.get(k + 1) - (arrStarsIndex.get(k) + 1);
                water += currWater;
                currWater = 0;
            }

            // Resetting the array list,so it's ready to get the stars index in the next
            // arrWaterNotFilled element
            arrStarsIndex.clear();

        }

        System.out.println();

        // Printing the result
        if (water == 1) {
            System.out.printf("The units of water this histogram can capture is: %s", water);
        } else if (water > 1) {
            System.out.printf("The units of water this histogram can capture are: %s", water);
        } else {
            System.out.println("This histogram can't capture any water");
        }
    }
}