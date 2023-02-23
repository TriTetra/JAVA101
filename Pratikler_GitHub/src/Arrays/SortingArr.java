package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArr {
    static Scanner input = new Scanner(System.in);
    static int arrElements;

    static void processMain() {
        int[] sortingArr = new int[arrElements];
        int point = 1;
        for (int i = 0; i < arrElements; i++) {
            System.out.print(point++ + ". number : ");
            sortingArr[i] = input.nextInt();
        }
        System.out.print("Your array : " + Arrays.toString(sortingArr));
        sortingProcess(sortingArr);
    }

    static void sortingProcess(int[] sortingArr) {
        int array = sortingArr.length;
        for (int i = 0; i < array - 1; i++) {
            if (sortingArr[i] > sortingArr[i + 1]) {
                int temp = sortingArr[i];
                sortingArr[i] = sortingArr[i + 1];
                sortingArr[i + 1] = temp;
                //Reset the index value to -1
                i = -1;
            }
        }
        System.out.println("\nSorted array : " + Arrays.toString(sortingArr));
    }

    public static void main(String[] args) {
        System.out.print("How many elements do you want array : ");
        arrElements = input.nextInt();
        processMain();
    }
}
