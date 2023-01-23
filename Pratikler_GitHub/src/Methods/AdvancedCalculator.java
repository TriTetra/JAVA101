package Methods;

import java.util.Scanner;

public class AdvancedCalculator {

    static Scanner input = new Scanner(System.in);
    static int x, y;
    static int number, result = 0, i = 1;

    static void Plus() {
        System.out.println("\n===================================");
        int pResult = 0;
        while (true) {
            System.out.print(i++ + ". number :");
            number = input.nextInt();
            if (number == 0) {
                break;
            }
            pResult += number;
        }
        result += pResult;
        System.out.println("Equals = "+pResult);
        System.out.println("Equals --> " + result);
        System.out.println("===================================\n");
    }

    static void Minus() {
        System.out.println("\n===================================");
        int mResult = 0;
        while (true) {
            System.out.print(i++ + ". number : ");
            number = input.nextInt();
            if (number == 0) {
                break;
            }
            mResult -= number;
        }
        result += mResult;
        System.out.println("Equals = "+mResult);
        System.out.println("Total --> " + result);
        System.out.println("===================================\n");
    }


    static void Times() {
        System.out.println("\n===================================");
        int tResult = 1;
        while (true) {
            System.out.print(i++ + ". number :");
            number = input.nextInt();
            if (number == 0) {
                break;
            }
            tResult *= number;
        }
        result += tResult;
        System.out.println("Equals = "+tResult);
        System.out.println("Total --> " + result);
        System.out.println("===================================\n");
    }

    static void Divide() {
        System.out.println("\n===================================");
        int dResult;
        System.out.print(i++ +". Firs Number :");
        x = input.nextInt();
        System.out.print(i++ +". Second Number : ");
        y = input.nextInt();
        dResult = x/y;
        result +=dResult;
        System.out.println("Equals = "+dResult);
        System.out.println("Total --> " + result);
        System.out.println("===================================\n");
    }

    static void Pow() {
        System.out.println("\n===================================");
        int pResult = 1;
        System.out.print(i++ +". Enter number :");
        x = input.nextInt();
        System.out.print(i++ +". Enter Power : ");
        y = input.nextInt();
        for (int i = 1; i <= y; i++) {
            pResult *= x;
        }
        result +=pResult;
        System.out.println("Equals = "+pResult);
        System.out.println("Total --> " + result);
        System.out.println("===================================\n");
    }

    static void Fact() {
        System.out.println("\n===================================");
        int fResult = 1;
        System.out.print(i++ +". Enter number : ");
        x = input.nextInt();
        for (int i = 1; i <= x; i++) {
            fResult *= i;
        }
        result +=fResult;
        System.out.println("Equals = "+fResult);
        System.out.println("Total --> " + result);
        System.out.println("===================================\n");
    }

    static void Mod(){
        System.out.println("\n===================================");
        int mResult;
        System.out.print(i++ +". Enter number :");
        x = input.nextInt();
        System.out.print(i++ +". Enter Mod : ");
        y = input.nextInt();
        mResult = x%y;
        result +=mResult;
        System.out.println("Equals = "+mResult);
        System.out.println("Total --> " + result);
        System.out.println("===================================\n");
    }

    static void Triangle(){
        System.out.println("\n===================================");
        int area,circumference;
        System.out.print(i++ +". Rectangle width :");
        x = input.nextInt();
        System.out.print(i++ +". Rectangle length : ");
        y = input.nextInt();
        area = x*y;
        circumference = x+y;
        System.out.println("Rectangle area = "+area);
        System.out.println("Rectangle circumference = "+circumference);
        System.out.println("===================================\n");
    }

    public static void main(String[] args) {
        int process;
        String menu = """
                Press 0 for operation result.!
                1 - Plus     2 - Minus\s
                3 - Times    4 - Divided\s
                5 - Power    6 - Factorial
                7 - Mod      8 - Rectangle find area and circumference
                0 - Exit""";

        do {
            System.out.println("----------------("+result+")----------------");
            System.out.println(menu);
            System.out.print("Please select the process : ");
            process = input.nextInt();
            switch (process) {
                case 1 -> Plus();
                case 2 -> Minus();
                case 3 -> Times();
                case 4 -> Divide();
                case 5 -> Pow();
                case 6 -> Fact();
                case 7 -> Mod();
                case 8 -> Triangle();
            }
        } while (process != 0);
        System.out.println("End of the process..");
    }
}
