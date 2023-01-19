package LoopsAndMethods;

import java.util.Scanner;

public class FindingEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter a number : ");
        number = input.nextInt();

        for(int i=0; i<number; i++){
            if (i%2==0){
                System.out.print(i+"-");
            }
        }
    }
}
