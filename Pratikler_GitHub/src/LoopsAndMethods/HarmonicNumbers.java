package LoopsAndMethods;

import java.util.Scanner;

public class HarmonicNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number,count,total=0;
        System.out.print("Enter number : ");
        number = input.nextInt();

        for (double i=1; i<=number; i++){
            count =1/i;
            total +=count;
        }
        System.out.println("Your Harmonic number is : "+total);
    }
}
