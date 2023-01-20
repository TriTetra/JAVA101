package LoopsAndMethods;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,total;
        int number1 = 0;
        int number2 = 1;
        System.out.print("Enter number : ");
        number = input.nextInt();
        System.out.print(number+" Series of fibonacci is ");
        for (int i = 0; i<number; i++){
            System.out.print(number1+"-");
            total = number1+number2;
            number1 = number2;
            number2 =total;
        }
    }
}
