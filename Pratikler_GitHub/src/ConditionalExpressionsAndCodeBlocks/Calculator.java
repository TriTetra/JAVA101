package ConditionalExpressionsAndCodeBlocks;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number,s1,s2;

        System.out.println("\n1 - Plus                2 - Minus");
        System.out.println("3 - Multiplied          4 - Divided     ");
        System.out.print("What process do you want to do : ");
        number = input.nextInt();
        System.out.println("\nEnter the larger number first..!");
        System.out.println("Enter the numbers you want to process :");
        s1 = input.nextInt();
        s2 = input.nextInt();

        switch (number) {
            case 1 -> System.out.println("Answer is -> " + (s1 + s2));
            case 2 -> System.out.println("Answer is -> " + (s1 - s2));
            case 3 -> System.out.println("Answer is -> " + (s1 * s2));
            case 4 -> System.out.println("Answer is -> " + (s1 / s2));
            default -> System.out.println("Error..try again.. ");
        }

    }
}
