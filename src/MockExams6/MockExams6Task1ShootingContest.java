/*
George and Peter (aka Gosho & Pesho) are participating in an online shooting contest. The game is simple - everyone will receive N amount of targets to hit and the first who hits all targets wins the round.

However, George and Peter shoot at different speeds and accuracy, so for example George will hit a target roughly once every Gs seconds, while Peter will need roughy Ps seconds.

Additionally, George and Peter are playing from different PCs and there is a variable amount of latency for each one of them - Gl and Pl.

So for example, the server sends the targets to George, which takes Gl seconds, Gosho shoots all targets with his shooting speed, and then the response back to the server take another Gl seconds.

Your task is to write a program which will determine if George or Peter will win the current round, or there will be a draw.

Input
Read from the standard input:

On the first line - the number N - the number of targets.
On the second line - Gs - George's speed.
On the third line - Gl - George's latency.
On the fourth line - Ps - Peter's speed
On the fifth line Pl - Peter's latency.
Output
Print to the standard output:

There is one line of output:
George - if George wins
Peter - if Peter wins
Draw - if the amount it takes is the same for both of them
Constraints
1 <= N, Gs, Gl, Ps, Pl <= 232
 */

import java.util.Scanner;

public class MockExams6Task1ShootingContest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfTargets = scanner.nextInt();
        double speedGosho = scanner.nextDouble();
        double latencyGosho = scanner.nextDouble();
        double speedPesho = scanner.nextDouble();
        double latencyPesho = scanner.nextDouble();

        double totalHitTimeGosho = (numOfTargets * speedGosho) + 2 * latencyGosho;
        double totalHitTimePesho = (numOfTargets * speedPesho) + 2 * latencyPesho;

        if (totalHitTimeGosho < totalHitTimePesho) {
            System.out.println("George");
        } else if (totalHitTimeGosho > totalHitTimePesho) {
            System.out.println("Peter");
        } else if (totalHitTimeGosho == totalHitTimePesho) {
            System.out.println("Draw");
        }

    }
}
