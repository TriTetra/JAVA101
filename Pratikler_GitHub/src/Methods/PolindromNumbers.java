package Methods;

import java.util.Scanner;

public class PolindromNumbers {

    static boolean Polindrom(int number) {

        int temp = number;
        int reverseNumber = 0;
        int lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
            System.out.println(reverseNumber);
        }
        return number == reverseNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number = ");
        int number = input.nextInt();
        System.out.println(Polindrom(number));
    }
}
