import java.util.Scanner;

public class Calculate_Hypotenuse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a,b;
        double u,c,area,m,n,z;

        System.out.println("Please enter you triangle informations for hypotenuse :");
        a = input.nextInt();
        b = input.nextInt();
        c = Math.sqrt((a*a+b*b));
        System.out.println("Triangle Hypotenuse is = "+c);

        System.out.println("\nPlease enter you triangle informations for area : ");
        m = input.nextInt();
        n = input.nextInt();
        z = input.nextInt();
        u= (m+n+z)/2;
        area =u*(u-m)*(u-n)*(u-z);
        System.out.println("Area of Triangle = "+Math.sqrt(area));





    }
}
