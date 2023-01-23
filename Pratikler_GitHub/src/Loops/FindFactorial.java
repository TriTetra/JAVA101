package Loops;

import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,total =1;
        System.out.print("Enter number : ");
        num = input.nextInt();

        for (int i=1; i<=num; i++){
            total *=i;
        }
        System.out.println(total);
    }
}
