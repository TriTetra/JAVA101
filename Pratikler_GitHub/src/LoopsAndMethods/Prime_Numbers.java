package LoopsAndMethods;

import java.util.Scanner;

public class Prime_Numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        System.out.print("Enter number : ");
        number = input.nextInt();

        for (int counter = 2; counter <= number; counter++) {
            boolean primeNumber = true;
            for (int prime = 2; prime < counter; prime++) {
                if (counter % prime == 0) {
                    primeNumber = false;
                    break;
                }
            }
            if (primeNumber){
                System.out.print(counter+"-");
            }
        }
    }
}