package ConditionalExpressionsAndCodeBlocks;

import java.util.Scanner;

public class ActivityByAirTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int weather;

        System.out.print("\nEnter the air temperature (Celsius) : ");
        weather = input.nextInt();

        if (-25<=weather && weather<=5){
            System.out.println("\n -> It will be more convenient for you to ski..");
        } else if (5<weather && weather<=15) {
            System.out.println("\n -> It would be more convenient for you to go to the cinema..");
        } else if (15<weather && weather<=25){
            System.out.println("\n -> It would be more convenient for you to have a picnic..");
        } else if (25<weather && weather<=45) {
            System.out.println("\n -> It will be more convenient for you to go swimming");
        }else System.out.println("\n --> Error..Try again.!");
    }
}
