package LoopsAndMethods;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = input.nextInt();
        int numberCounter = 0;
        int valueNumber;
        int numberPow ;
        int result = 0;
        int tempNumber = number;
        int totalValueNumber = 0;

        while (tempNumber>0){
            tempNumber/=10;
            numberCounter++;
        }

        tempNumber = number;
        while (tempNumber>0){
            valueNumber = tempNumber % 10;
            numberPow = 1;
            for (int i = 1; i<=numberCounter; i++){
                numberPow *= valueNumber;
            }
            totalValueNumber +=valueNumber;
            result +=numberPow;
            tempNumber /=10;
        }
        if (result == number) {
            System.out.print("\nThis is an armstrong number : "+number);
        } else {
            System.out.print("This is not an armstrong number : "+number);
        }
        System.out.print("\nTotal of the values number is = "+totalValueNumber);
    }
}
