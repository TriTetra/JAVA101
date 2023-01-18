package ConditionalExpressionsAndCodeBlocks;

import java.util.Scanner;

public class Leap_Year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year,Lyear;
        System.out.print("Enter year : ");
        year = input.nextInt();
        Lyear = year%4;

       if (Lyear == 0){
           System.out.println("Leap year");
       }else System.out.println("Its not a leap year");
    }
}
