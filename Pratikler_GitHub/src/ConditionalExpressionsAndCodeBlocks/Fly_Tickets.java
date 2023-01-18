package ConditionalExpressionsAndCodeBlocks;

import java.util.Scanner;

public class Fly_Tickets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double price = 3;
        double km, age, price1, price2, price3, realprice, back, discount;
        String rTicket;

        System.out.println("\nHave you received your ticket as a  round-trip ticket ? (Yes/No)");
        rTicket = input.next();
        System.out.println("Please enter your age ?");
        age = input.nextInt();
        System.out.println("How many kilometers will you go : ");
        km = input.nextInt();

        discount = km * price;

        back = discount * 0.2;

        price1 = discount * 0.5;
        price2 = discount * 0.1;
        price3 = discount * 0.3;

        if (rTicket.equals("Yes")) {

            if (0 <= age && age <= 12) {
                System.out.println("Fly type discount is " + back + "TL and Age discount is " + price1 + "TL");
                realprice = (km * price) - (price1 + back);
                System.out.print("Your payment is : " + realprice + "TL");
            } else if (12 < age && age <= 24) {
                System.out.println("Fly type discount is " + back + "TL and Age discount is " + price2 + "TL");
                realprice = (km * price) - (price2 + back);
                System.out.print("Your payment is : " + realprice + "TL");
            } else if (age <= 65) {
                System.out.println("Fly type discount is " + back + "TL and Age discount is " + price3 + "TL");
                realprice = (km * price) - (price3 + back);
                System.out.print("Your payment is : " + realprice + "TL");
            } else System.out.println("Error..Try again.!");
        } else if (rTicket.equals("No")) {
            if (0 <= age && age <= 12) {
                System.out.println("Age discount is " + price1 + "TL");
                realprice = (km * price) - (price1);
                System.out.print("Your payment is : " + realprice + "TL");
            } else if (12 < age && age <= 24) {
                System.out.println("Age discount is " + price2 + "TL");
                realprice = (km * price) - (price2);
                System.out.print("Your payment is : " + realprice + "TL");
            } else if (age <= 65) {
                System.out.println("Age discount is " + price3 + "TL");
                realprice = (km * price) - (price3);
                System.out.print("Your payment is : " + realprice + "TL");
            } else System.out.println("Error..Try again.!");
        }
    }
}
