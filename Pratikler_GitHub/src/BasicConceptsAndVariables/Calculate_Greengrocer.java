package BasicConceptsAndVariables;

import java.util.Scanner;

public class Calculate_Greengrocer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double fruit,kg;

        System.out.println("Apple     = 0           Armut  = 1");
        System.out.println("Tomato    = 2           Banana = 3");
        System.out.println("Aubergine = 4");
        System.out.print("Choose which fruit do you want to buy :");
        fruit =input.nextInt();

        System.out.print("How much KG fruit do you want to buy :");
        kg = input.nextInt();



        if (fruit == 0){
                System.out.println("The amount you want to buy for Apple : "+kg+"KG Price of fruit : "+(kg*3.67));
        } else if (fruit == 1) {
            System.out.println("The amount you want to buy for Peach : "+kg+"KG Price of fruit : "+(kg*2.14));
        } else if (fruit == 2) {
            System.out.println("The amount you want to buy for Tomato : "+kg+"KG Price of fruit : "+(kg*1.11));
        } else if (fruit == 3) {
            System.out.println("The amount you want to buy for Bananas : "+kg+"KG Price of fruit : "+(kg*0.95));
        } else if (fruit == 4) {
            System.out.println("The amount you want to buy for Aubergine : "+kg+"KG Price of fruit : "+(kg*5.00));
        } else System.out.println("Please enter correct words..");

        /*if(x >= (int)Math.pow(-2, 63) && x <= (int)(Math.pow(2, 63) - 1)){
            System.out.println("* long");*/
        }

    }

