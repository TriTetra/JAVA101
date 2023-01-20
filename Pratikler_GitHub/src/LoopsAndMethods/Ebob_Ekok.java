package LoopsAndMethods;

import java.util.Scanner;

public class Ebob_Ekok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2;
        int ebob = 0;
        int ekok = 0;
        System.out.print("Enter first number : ");
        number1 = input.nextInt();
        System.out.print("Enter second number : ");
        number2 = input.nextInt();

        for (int i = 1; i <= number1; i++) {
            if (number1%i==0 && number2%i==0){
                ebob = i;
            }
        }

        for (int i = number1; i <= (number1*number2); i++){
            if (i%number1 == 0 && i%number2==0){
                ekok = i;
                break;
            }
        }
        System.out.println("Ebob = "+ebob);
        System.out.println("Ekok = "+ekok);

    }
}
