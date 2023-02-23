package Arrays;

import java.util.Scanner;

public class MaxandMinNumbers {

    static Scanner input = new Scanner(System.in);
    static int arrylenght;

    static void arrayWork(int arrylenght) {
        //Counting numbers
        int point = 1;
        //Our main array
        int[] arr = new int[arrylenght];
        //Taking number to array
        for (int i = 0; i < arrylenght; i++) {
            System.out.print(point++ + ". number : ");
            arr[i] = input.nextInt();
        }
        //Listing numbers
        System.out.println("Your array numbers :");
        for (int i = 0; i < arrylenght; i++) {
            System.out.print(arr[i] + "-");
        }

        int min = arr[0];
        int max = arr[0];

        for (int i : arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.print("\n\nMax number is = " + max);
        System.out.print("\nMin number is = " + min);
    }

    public static void main(String[] args) {
        System.out.print("How many elements do you want array : ");
        arrylenght = input.nextInt();
        arrayWork(arrylenght);

    }
}
