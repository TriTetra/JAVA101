package Loops;

import java.util.Scanner;

public class FindPowOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print("Enter number : ");
        num = input.nextInt();

        System.out.println("Powers of 4 :");
        for (int i=1; i<num; i*=4){
            System.out.print(i+"-");
        }
        System.out.println("\nPowers of 5 :");
        for (int i=1; i<num; i*=5){
            System.out.print(i+"-");
        }
    }
}
