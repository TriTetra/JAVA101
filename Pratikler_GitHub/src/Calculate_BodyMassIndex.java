import java.util.Scanner;

public class Calculate_BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double height,weight,index;

        System.out.print("Enter your height (1,78) : ");
        height = input.nextDouble();
        System.out.print("Enter your weight (KG) : ");
        weight = input.nextDouble();

        index = weight/(height*height);

        System.out.println("\nYour Body Mass Index is : "+index);

    }
}
