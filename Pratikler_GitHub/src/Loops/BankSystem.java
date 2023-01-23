package Loops;

import java.util.Random;
import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        int right = 3;
        String password, personelId;
        int action, add;
        int money = random.nextInt(1100) + 2000;


        System.out.print("Enter your Id : ");
        personelId = input.next();
        System.out.print("Enter Your Password : ");
        password = input.next();

        if (personelId.equals("12345678999") && password.equals("Zero0000")) {
            System.out.println("\n --> Mrs.Halime welcome back again..");
            do {
                System.out.println("\n==========================================");
                System.out.println("Your balance is : " + money+"TL");
                System.out.println("1 - Pay in            2 - Withdraw money ");
                System.out.println("3 - Take loan         4 - Exit");
                System.out.println("How can we help you : ");
                System.out.println("==========================================");
                action = input.nextInt();


                switch (action) {
                    case 1 -> {
                        System.out.print("Enter money : ");
                        add = input.nextInt();
                        money += add;
                        System.out.println("Your current balance is : " + money);
                    }
                    case 2 -> {
                        System.out.print("Enter money : ");
                        add = input.nextInt();
                        money -= add;
                        System.out.println("Your current balance is : " + money);
                    }
                    case 3 -> {
                        System.out.print("How much loan do you want : ");
                        add = input.nextInt();
                        money += add;
                        System.out.println("Your current balance is : " + money);
                    }
                }
            } while (action != 4);
            System.out.println("See you again..");
        } else {
            right--;
            System.out.println("Your password or Id incorrect please check again..");
            if (right == 0) {
                System.out.println("Your account has been blocked, please contact the bank.");
            } else {
                System.out.println("Remaining right : " + right);
            }
        }
    }
}
