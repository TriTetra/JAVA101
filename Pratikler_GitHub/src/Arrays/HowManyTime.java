package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class HowManyTime {
    static Scanner input = new Scanner(System.in);
    static int arrayElements;
    static int point = 1;
    static int count = 0;

    static void mainArray() {
        int[] Array = new int[arrayElements];
        listingMainArray(Array);
    }

    static void listingMainArray(int[] Array) {
        for (int i = 0; i < arrayElements; i++) {
            System.out.print(point++ + ".number : ");
            Array[i] = input.nextInt();
        }
        System.out.println("Your Array : " + Arrays.toString(Array));
        sortingMainArray(Array);
    }

    static void sortingMainArray(int[] Array) {
        for (int i = 0; i < Array.length - 1; i++) {
            if (Array[i] > Array[i + 1]) {
                int temp = Array[i];
                Array[i] = Array[i + 1];
                Array[i + 1] = temp;
                i = -1;
            }
        }
        System.out.println("Sorted array : " + Arrays.toString(Array));
        recurringNumber(Array);
    }

    static void recurringNumber(int[] Array) {
        for (int i = 0; i < Array.length; i++) {
            for (int j = 0; j < Array.length; j++) {
                if (Array[i] == Array[j]) {
                    if (j < i) {
                        break;
                    }
                    count++;
                }
            }
            if (count > 0) {
                System.out.println(Array[i] + " this number " + count + " time printed..");
                count = 0;
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter the size of Array : ");
        arrayElements = input.nextInt();
        mainArray();

    }
}
