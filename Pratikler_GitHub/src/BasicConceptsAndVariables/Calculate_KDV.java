package BasicConceptsAndVariables;

import java.util.Scanner;

public class Calculate_KDV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int product, value,value1;
        System.out.print("Enter the price of the product : ");
        product = input.nextInt();

        value = product-(product*18/100);
        value1 = product-(product*8/100);

        System.out.print((0<=product && product<=1000)? "Price of Product : "+value+"TL":(product>1000)?"Price of Product : "
                +value1+"TL" : "Please enter correct price..");




    }
}
