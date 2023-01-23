package Loops;

import java.util.Scanner;

public class MaxOrMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, counter;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.print("How much number are you going to enter : ");
        number = input.nextInt();

        for (int i = 0; i <= number; i++) {
            System.out.print(i + ".Enter number : ");
            counter = input.nextInt();
            if (counter < max) {
                max = counter;
            } else if (counter > min) {
                min = counter;
            } else System.out.println("Error..Try again.!");
        }

        System.out.println("\nMax number is " + min);
        System.out.println("Min number is " + max);
    }
}
