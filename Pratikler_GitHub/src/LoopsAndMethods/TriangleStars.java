package LoopsAndMethods;

import java.util.Scanner;

public class TriangleStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int star;
        System.out.print("Enter number : ");
        star = input.nextInt();

        for (int i=0; i<=star; i++) {
            for (int k = 0; k <=(star - i); k++) {
                System.out.print("   ");
            }
            for (int j = 0; j <=(2 * i); j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        for (int i=1; i<=star; i++){
            for (int j=0; j<=i; j++){
                System.out.print("   ");
            }
            for (int k=i; k<=star; k++){
                System.out.print(" * ");
            }
            for (int k=i; k<star; k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        /*for (int i = 1; i <= Input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("   ");
            }
            for (int j = i; j < Input; j++) {
                System.out.print("*  ");
            }
            for (int j = i; j <= Input; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }*/
    }
}

