package Loops;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int triangle;
        System.out.print("Enter number : ");
        triangle = input.nextInt();


        for (int i = 1; i<=triangle; i++){
            for (int k = 1; k<=i; k++){
                System.out.print("   ");
            }
            for (int k = i; k< triangle; k++){
                System.out.print(" * ");
            }
            for (int k = i; k<= triangle; k++){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
