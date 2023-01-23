package Loops;

import java.util.Scanner;

public class FindingEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double number,toplam=0,sum=0;

        System.out.print("Enter a number : ");
        number = input.nextInt();

        for(int i=1; i<number; i++){
            if (i%3==0 || i%4==0){
                toplam+=i;
                sum++;
                System.out.print(i+"-");
            }
        }
        System.out.println("\n\nDönüş sayısı = "+sum);
        System.out.println("Toplamı = "+toplam);
        System.out.println("Sayıların ortalaması = "+toplam/sum);
    }
}
