/*
The Chinese zodiac assigns an animal to year according to the following table:

Year	Animal		Year	Animal
2000	Dragon		2006	Dog
2001	Snake		2007	Pig
2002	Horse		2008	Rat
2003	Sheep		2009	Ox
2004	Monkey		2010	Tiger
2005	Rooster		2011	Hare
Write a program that determines the zodiac sign for a particular year. Note that the cycle repeats itself, so 2012 will be the year of the Dragon again.

Input
On the first line, you will receive the year
Output
On the only line of output, print the corresponding zodiac Sign
*/
import java.util.Scanner;

public class Pack5Task2ChineseZodiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int years = scanner.nextInt();
        int cycle = years % 12;

        if (cycle == 8) {
            System.out.println("Dragon");
        }
        if (cycle == 9) {
            System.out.println("Snake");
        }
        if (cycle == 10) {
            System.out.println("Horse");
        }
        if (cycle == 11){
            System.out.println("Sheep");
        }
        if (cycle == 0){
            System.out.println("Monkey");
        }
        if (cycle == 1){
            System.out.println("Rooster");
        }
        if (cycle == 2){
            System.out.println("Dog");
        }
        if (cycle == 3){
            System.out.println("Pig");
        }
        if (cycle == 4){
            System.out.println("Rat");
        }
        if (cycle == 5){
            System.out.println("Ox");
        }
        if (cycle == 6){
            System.out.println("Tiger");
        }
        if (cycle == 7){
            System.out.println("Hare");
        }
    }
}
