package Methods;

import java.util.Scanner;

public class PrimeNumbers {

    static boolean primeNumbers(int number) {
        boolean isPrime = true;
        for (int i = 2; i < (number / 2); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Its PRİME number..");
        } else System.out.println("Its not PRİME number..");

        return isPrime;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter number : ");
            number = input.nextInt();
            primeNumbers(number);
        }while (number != 0);
        System.out.println("End of the Session..");
    }
}
