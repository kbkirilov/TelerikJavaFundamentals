/*
Your first project in the Academy is to develop a simple game about a hero who must save the princess and rule the kingdom. However, as in all great games, the first few levels are difficult and the evil uncle's guards are constantly on the hunt for our hero. Luckily, there are several safehouses, where the hero can hide.

When starting a game, safehouses spawn at random locations and, according to the difficulty level, our hero may spawn far from or near to a safehouse. Your task is to determine the spawning location of the hero in Easy Mode. To do that, you must find the greatest distance from a possible spawn location to a safehouse and not spawn there.

In the example below, there are 6 possible spawn points, 1 of them has a safehouse (S), and 5 don't (X). The greatest distance from X to S is therefore 3. This is the spawn point that must be excluded in easy mode.

X - X - X - S - X - X
3   2   1   0   1   2
If there are multiple safehouses, for each spawn location you need to determine the nearest safe house, and then return the largest of those distances. (Check the second example)

Input
Exactly two lines:

The number of spawn points
Numbers (unique, unordered) - the indices (zero-based) of spawn points with safe houses.
Output
Exactly one line:

The greatest distance
Constraints
2 < spawn points < 30
there will always be at least one safehouse
 */


import java.util.Arrays;
import java.util.Scanner;

public class MockExams6Task3SafeHouses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the numbers of spawn points
        int numSpawnPoints = scanner.nextInt();
        scanner.nextLine();// consumes the newline

        // Read the safehouse locations as an array of integers
        String[] safehouseInput = scanner.nextLine().split(" ");
        int[] safehouseIndices = new int[safehouseInput.length];
        for (int i = 0; i < safehouseIndices.length; i++) {
            safehouseIndices[i] = Integer.parseInt(safehouseInput[i]);
        }

        // Initialize a variable to keep track of the greatest distance
        int maxDistance = 0;

        // Iterate over each possible spawn point
        for (int i = 0; i < numSpawnPoints; i++) {
            boolean isSafehouse = false;
            for (int safehouse : safehouseIndices) {
                if (i == safehouse) {
                    isSafehouse = true;
                    break;
                }
            }

            if (!isSafehouse) {
                // Calculate the distance to the nearest safehouse
                int minDistanceToSafehouse = Integer.MAX_VALUE;
                for (int safehouse : safehouseIndices) {
                    int distance = Math.abs(i - safehouse);
                    if (distance < minDistanceToSafehouse) {
                        minDistanceToSafehouse = distance;
                    }
                }

                // Update the maximum distance if this one is greater
                if (minDistanceToSafehouse > maxDistance) {
                    maxDistance = minDistanceToSafehouse;
                }
            }
        }

        // Output the greatest distance found
        System.out.println(maxDistance);

    }
}
