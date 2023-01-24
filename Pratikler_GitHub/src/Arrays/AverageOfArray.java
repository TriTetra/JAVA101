package Arrays;

import java.util.Scanner;

public class AverageOfArray {

    static Scanner input = new Scanner(System.in);

    static int arry(int number,int arryNumber){
        int[] averageArray = new int[arryNumber];
        int result = 0;
        int cycle = 0;
        int point = 1;
        for (int i=0; i<number; i++){
            System.out.print(point++ +". number : ");
            averageArray[i]= input.nextInt();
        }
        System.out.println("Your array numbers :");
        for (int i = 0; i<number; i++){
            System.out.print(averageArray[i]+"-");
        }
        for (int i=0; i< averageArray.length; i++){
            result += averageArray[i];
            cycle++;
        }
        System.out.println("\nResult = "+result);
        System.out.println("Cycle = "+(cycle-1));
        System.out.println("Your average is : "+result/(cycle-1));
        return  result;
    }

    public static void main(String[] args) {
        int arryNumber,number;
        System.out.print("How many elements will you create this array : ");
        arryNumber = input.nextInt();
        System.out.print("How much number do you want to enter : ");
        number = input.nextInt();
        arry(number,arryNumber);

    }
}
