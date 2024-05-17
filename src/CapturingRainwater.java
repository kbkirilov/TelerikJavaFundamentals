import java.util.Scanner;

public class CapturingRainwater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {4, 2, 1, 3, 0, 1, 2};

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

        //
        int lineBelow = lines;

        int rows = lines + 1;

        // This will store the histogram in an array
        String[] arrWaterNotFilled = new String[rows];

        // This will store each row from the histogram as String, which
        // will be appended to the arrWaterNotFilled array
        StringBuffer sb = new StringBuffer();

        System.out.println("This is the histogram before filling it with water:");
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

            // Goes on a new line
            //System.out.println();
        }

        // Now the arrWaterNotFilled array contains the whole histogram
        // "x" are the static spaces and "0" are the empty ones

        int index2 = arrWaterNotFilled.length - 1;

        // Checks each element in the arrWaterNotFilled array
        for (int i = arrWaterNotFilled.length - 1; i >= 0 ; i--) {

            String currElement = arrWaterNotFilled[index2];

            // Checks each character of each element in the arrWaterNotFilled array
            for (int j = 1; j < currElement.length() - 2; j++) {
                String curr = Character.toString(currElement.charAt(j));
                String previous = Character.toString(currElement.charAt(j - 1));
                String next = Character.toString(currElement.charAt(j + 1));
                String nextAfterNext = Character.toString(currElement.charAt(j + 2));

                // When to add water and when not to
                if (curr.equals("0") && previous.equals("*") && next.equals("*")) {
                    water++;
                }

                if ((curr.equals("0") && (previous.equals("*") && next.equals("0") && nextAfterNext.equals("0")) ||
                        (curr.equals("0") && (previous.equals("*") && next.equals("0") && nextAfterNext.equals("*"))))) {
                    water++;
                }
            }

            index2--;
        }


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