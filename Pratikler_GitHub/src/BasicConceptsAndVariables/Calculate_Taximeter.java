package BasicConceptsAndVariables;

import java.util.Scanner;

public class Calculate_Taximeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double price,km;
        System.out.println("The Taximeter opening fee is 10 TL.");
        System.out.print("Enter how KM you want to go : ");
        km = input.nextInt();
        price = km*2.20;

        System.out.println((0<=price && price<=20)?"Your Road Fee :"+(price+30)+"TL":(price>20)?"Your Road Fee :"+(price+10)+"TL":"Please enter correct..");

        /*if (0<=price && price<=20){
            System.out.println("Your Road Fee :"+(price+30)+"TL");
        } else if (price>20) {
            System.out.println("Your Road Fee :"+(price+10)+"TL");
        }else System.out.println("Please enter correct..");*/
    }
}
