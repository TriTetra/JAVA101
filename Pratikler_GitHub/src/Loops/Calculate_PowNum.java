package Loops;

import java.util.Scanner;

public class Calculate_PowNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num,pow,total=1;

        System.out.print("Enter number : ");
        num = input.nextInt();
        System.out.print("Enter power of number : ");
        pow = input.nextInt();

        for (int i=1; i<=pow; i++){
            total *= num;
        }
        System.out.println(total);
    }
}
