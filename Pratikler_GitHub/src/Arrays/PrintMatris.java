package Arrays;

import java.util.Scanner;

public class PrintMatris {

    static Scanner input = new Scanner(System.in);
    static int width, length;

    static void processMatris() {
        int[][] matrisArr = new int[width][length];
        int number = 1;
        for (int i = 0; i < matrisArr.length; i++) {
            for (int j = 0; j < matrisArr[i].length; j++) {
                matrisArr[i][j] = number++;
            }
        }

        /*for (int i = 0; i < matrisArr.length; i++) {
            for (int j = 0; j < matrisArr[i].length; j++) {
                System.out.println(matrisArr[i][j] + " ");
            }
            System.out.println();
        }*/

        for (int[] ints : matrisArr) {
            for (int anInt : ints) {
                System.out.print(anInt + "  ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        System.out.print("Enter width : ");
        width = input.nextInt();
        System.out.print("Enter length : ");
        length = input.nextInt();
        processMatris();
    }
}
