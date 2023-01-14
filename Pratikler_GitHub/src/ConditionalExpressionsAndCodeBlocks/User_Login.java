package ConditionalExpressionsAndCodeBlocks;

import java.util.Scanner;

public class User_Login {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String username,password;

        System.out.print("\nEnter your Username : ");
        username = input.next();
        System.out.print("Enter your Password : ");
        password = input.next();

        if (username.equals("Walker") && password.equals("Zero1234")){
            System.out.println("\n==============================");
            System.out.println(" --> Welcome Walker...");
            System.out.println("==============================");
        }else if (username.equals("Fighter") && password.equals("born1111")){
            System.out.println("\n==============================");
            System.out.println(" --> Welcome Fighter..");
            System.out.println("==============================");
        } else {
            System.out.println("\n==============================");
            System.out.println(" --> Error..Try again..");
            System.out.println("==============================");
        }
    }
}
