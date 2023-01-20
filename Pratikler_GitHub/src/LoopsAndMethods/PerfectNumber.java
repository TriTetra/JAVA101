package LoopsAndMethods;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int toplam = 0;
        int perfectNumber = 0;
        System.out.print("Enter number : ");
        number = input.nextInt();

        for (int i = 1; i<=number; i++){
            if (number%i==0){
                toplam +=i;
            }
            perfectNumber = toplam-number;
        }
        if (perfectNumber == number){
              System.out.println(perfectNumber+" Its perfect number..");
        }else System.out.println(perfectNumber+" Its not a perfect number..");
    }
}
