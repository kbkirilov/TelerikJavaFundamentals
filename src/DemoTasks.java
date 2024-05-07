import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class DemoTasks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Reading the first array's elements
        String[] arr1 = scanner.nextLine().split(",");
        //Reading the second array's elements
        String[] arr2 = scanner.nextLine().split(",");

        //Declaring a new array 
        String[] combined = new String[arr1.length + arr2.length];


        //Combining the arrays
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            combined[index] = arr1[i];
            index += 2;
        }

        index = 1;

        for (int i = 0; i < arr2.length; i++) {
            combined[index] = arr2[i];
            index += 2;
        }

        System.out.println(String.join(",", combined));
    }
}
