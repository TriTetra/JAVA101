package Loops;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number,total=0;

        do {
            System.out.print("Enter number = ");
            number = input.nextInt();
            total+=number;
            if (number%2==1){
                break;
            }
        }while (number>0);

        System.out.println("Toplamları "+total);




        /*while (true){
            if (sayi%2==0){
                for (int i=1; i<sayi; i++){
                    if (i%2==0){
                        toplam+=i;
                        sum++;
                        System.out.print(i+"-");
                    }
                }
                System.out.println("\nToplamları = "+toplam);
                System.out.println("Sayıların ortalaması = "+toplam/sum);
            } else if (sayi%2==1){
                System.out.println("Sonlandırıldı");
            }

        }
        for (int i=1; i<sayi; i++){
            if (i%2==0){
                toplam+=i;
                sum++;
                System.out.print(i+"-");
            }
        }
        System.out.println("\nToplamları = "+toplam);
        System.out.println("Sayıların ortalaması = "+toplam/sum);*/
    }
}
