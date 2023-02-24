package Arrays;

import java.util.Scanner;

public class MatristoTranspose {
    static Scanner input = new Scanner(System.in);
    static int width, length;
    static int number = 0;

    static void matrisArray() {
        int[][] matris = new int[width][length];
        numberProcess(matris);
    }

    /*static void transposeArray() {
        int[][] transpose = new int[length][width];
        numberProcess(transpose);
    }*/

    static void numberProcess(int[][] matris) {

        int[][] transpose = new int[length][width];
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= length; j++) {
                System.out.print(i + ".width " + j + ".length enter number : ");
                number = input.nextInt();
                matris[i - 1][j - 1] = number;
                transpose[j - 1][i - 1] = number;
            }
        }
        transposeProcess(transpose);
        matrisProcess(matris);
    }

    static void matrisProcess(int[][] matrisArray) {
        System.out.println("\nYour Matris : ");
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(matrisArray[i][j] + "  ");
            }
            System.out.println();
        }
    }

    static void transposeProcess(int[][] transpose) {
        System.out.println("\nYour Transpose : ");
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(transpose[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter width : ");
        width = input.nextInt();
        System.out.print("Enter length : ");
        length = input.nextInt();
        matrisArray();

    }
}
