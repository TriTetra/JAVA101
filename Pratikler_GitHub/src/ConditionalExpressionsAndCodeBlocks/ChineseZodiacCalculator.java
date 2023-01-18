package ConditionalExpressionsAndCodeBlocks;

import java.util.Scanner;

public class ChineseZodiacCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year,zodiac;
        System.out.print("\nEnter the year you were born :");
        year = input.nextInt();
        zodiac = year%12;

        switch (zodiac) {
            case 0 -> System.out.println(" --> Monkey");
            case 1 -> System.out.println(" --> Rooster");
            case 2 -> System.out.println(" --> Dog");
            case 3 -> System.out.println(" --> Pig");
            case 4 -> System.out.println(" --> Rat");
            case 5 -> System.out.println(" --> Ox");
            case 6 -> System.out.println(" --> Tiger");
            case 7 -> System.out.println(" --> Rabbit");
            case 8 -> System.out.println(" --> Dragon");
            case 9 -> System.out.println(" --> Snake");
            case 10 -> System.out.println(" --> Horse");
            case 11 -> System.out.println(" --> Goat");
            default -> System.out.println("Error..Try again.!");
        }
    }
}
