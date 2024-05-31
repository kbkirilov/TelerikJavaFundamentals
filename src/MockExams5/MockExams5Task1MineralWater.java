/*
Mineral Water
Jimmy is a truck driver who delivers mineral water. He loads the water from a warehouse and distributes it within many stores in the town. Sometimes when Jimmy goes to the warehouse there is not enough water to full the truck which makes him angry. He wants to go for delivery only if the truck is full.

You can help him if you write a program that checks if it is possible to load the whole truck.

The mineral water is available in two types of bottles - 1 liter and 5 liters. Jimmy always tries to load as much of the big bottles first and then adds small bottles. Given the capacity of the truck and the available bottles in the warehouse you should calculate the number of small bottles that he will load. If there are not enough small bottles the result should be -1.

Input
Read from the standard input:

The number of small bottles in the warehouse - integer number
The number of big bottles in the warehouse - integer number
The capacity of the truck - integer number
Output
Print to the standard output:

One line of output:
the number of small bottles he will deliver.
-1 if not possible to fill completely the truck.

 */
import java.util.Scanner;

public class MockExams5Task1MineralWater {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int smallBottlesCount = scanner.nextInt();
        int bigBottlesCount = scanner.nextInt();
        int truckCapacity = scanner.nextInt();

        // Calculate maximum capacity that can be filled with big bottles
        int maxBigBottlesUsed = truckCapacity / 5;

        // Use the lesser of available big bottles or required big bottles
        int bigBottlesUsed = Math.min(bigBottlesCount, maxBigBottlesUsed);

        // Calculate the remaining capacity to be filled with small bottles
        int remainingCapacity = truckCapacity - (bigBottlesUsed * 5);

        // Check if the remaining capacity can be filled with small bottles
        if (remainingCapacity <= smallBottlesCount) {
            System.out.print(remainingCapacity);
        } else {
            System.out.print(-1);
        }
    }
}
