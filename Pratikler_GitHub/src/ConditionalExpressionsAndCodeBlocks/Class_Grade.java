package ConditionalExpressionsAndCodeBlocks;

import java.util.Scanner;

public class Class_Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double physics,chemistry,turkish,math,music,average;

        System.out.print("\n --> Enter your physics grade : ");
        physics = input.nextDouble();
        System.out.print(" --> Enter your chemistry grade : ");
        chemistry = input.nextDouble();
        System.out.print(" --> Enter your turkish grade : ");
        turkish = input.nextDouble();
        System.out.print(" --> Enter your math grade : ");
        math = input.nextDouble();
        System.out.print(" --> Enter your music grade : ");
        music = input.nextDouble();

        average = (physics+chemistry+turkish+math+music)/5;

        if (0<=average && average<=100){
            if (55<=average){System.out.println("\nCongratulations your average score : "+average);}
            else {System.out.println("\nYou failed..");}
        } else {System.out.println("\nError...");}

        }
    }

