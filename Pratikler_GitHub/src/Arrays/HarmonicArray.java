package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class HarmonicArray {

    static Scanner input = new Scanner(System.in);

    static double arrayJob(int addNumbers) {
        double[] arrayJob = new double[15];
        int point = 1;
        double result = 0;

        for (int i = 0; i < addNumbers; i++) {
            System.out.print(point++ + ". Number : ");
            arrayJob[i] = input.nextInt();
        }

        for (int i = 0; i < arrayJob.length; i++) {
            if (arrayJob[i]>0){
                result += 1 / arrayJob[i];
                System.out.print(result + " - ");
            }
        }
        System.out.print("\nResult is : " + result);
        return result;
    }

    public static void main(String[] args) {
        int addNumbers;
        System.out.print("How many numbers are you going to add : ");
        addNumbers = input.nextInt();
        arrayJob(addNumbers);
    }
}
