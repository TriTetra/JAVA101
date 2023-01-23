package Methods;

import java.util.Scanner;

public class FibonacciNumbers {

    //  1  1  2  3  5  8  13  21 34

    // f(1) = 1
    // f(2) = 2

    // f(n) = f(n-1) + f(n-2)
    // f(6) = f(5) + f(4)
    // f(5) = f(4) + f(3)
    // f(4) = f(3) + f(2)
    // f(3) = f(2) + f(1)

    static int Fibonacci(int n){

        if ((n==1) || (n==2)){
            return 1;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Numbers : ");
        int n = input.nextInt();
        System.out.println(Fibonacci(n));
    }
}
