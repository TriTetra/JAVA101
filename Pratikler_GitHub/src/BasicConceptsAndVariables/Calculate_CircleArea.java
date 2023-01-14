package BasicConceptsAndVariables;

import java.util.Scanner;

public class Calculate_CircleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double Pi = 3.14,peacearea,circumference,r,a,area;

        System.out.println("Enter the radius of circle:");
        r = input.nextInt();
        System.out.println("Enter the center angle of circle :");
        a = input.nextInt();

        peacearea = (Pi*(r*r)*a)/360;
        area = Pi*r*r;
        circumference = 2*Pi*r;

        System.out.print("Circle's Center angle : "+peacearea);
        System.out.println("\nCircle's Area : "+area);
        System.out.println("Circle's Circumference : "+circumference);

    }
}
