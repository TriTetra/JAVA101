package Arrays;

import java.util.Scanner;

public class FindingRecurringNumbers {
    static Scanner input = new Scanner(System.in);
    static int arrElements;

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    static void processArr() {

        int[] mainArr = new int[arrElements];
        int point = 1;
        for (int i = 0; i < arrElements; i++) {
            System.out.print(point++ + ". number : ");
            mainArr[i] = input.nextInt();
        }
        System.out.println("Your array numbers :");
        for (int i = 0; i < arrElements; i++) {
            System.out.print(mainArr[i] + "-");
        }

        int[] duplicate = new int[mainArr.length];
        int startIndex = 0;

        for (int i = 0; i < mainArr.length; i++) {
            for (int j = 0; j < mainArr.length; j++) {
                if ((i != j) && mainArr[i] == mainArr[j]) {
                    if (!isFind(duplicate, mainArr[i])) {
                        duplicate[startIndex++] = mainArr[i];
                    }
                    break;
                }
            }
        }

        System.out.println("\n\nRecurring Numbers : ");
        for (int value : duplicate) {
            if (value != 0) {
                System.out.print(value+" - ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("How many elements do you want array : ");
        arrElements = input.nextInt();
        processArr();
    }
}
