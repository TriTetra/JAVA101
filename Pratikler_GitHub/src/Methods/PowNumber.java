package Methods;

import java.util.Scanner;

public class PowNumber {

    static int Pow(int number, int power){
        int result = 1;
        for (int i=0; i<power; i++){
            result *= number;
        }
        System.out.println("Equals = "+result);
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,power;
        do {
            System.out.print("Enter number : ");
            number = input.nextInt();
            System.out.print("Enter power : ");
            power = input.nextInt();
            Pow(number,power);
        }while (number != 0);
        System.out.println("End of the session..");
    }
}
