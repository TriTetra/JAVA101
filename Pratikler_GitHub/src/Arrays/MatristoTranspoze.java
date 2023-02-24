package Arrays;

import java.util.Scanner;

public class MatristoTranspoze {

    static int width, length;

    static void mainArray() {
        int[][] matrisArray = new int[width][length];
        numberProcess(matrisArray);
    }

    static void numberProcess(int[][] matrisArray) {
        int number = 1;
        for (int i = 0; i < matrisArray.length; i++) {
            for (int j = 0; j < matrisArray[i].length; j++) {
                matrisArray[i][j] = number++;
            }
        }
        matrisProcess(matrisArray);
        transposeArray(matrisArray);
    }

    static void transposeArray(int[][] matrisArray) {
        int[][] transpose = new int[matrisArray[0].length][matrisArray.length];
        transposeProcess(transpose);
    }


    static void matrisProcess(int[][] matrisArray) {
        System.out.println("\nYour Matris : ");
        for (int i = 0; i < matrisArray.length; i++) {
            for (int j = 0; j < matrisArray[i].length; j++) {
                System.out.print(matrisArray[i][j] + "  ");
            }
            System.out.println();
        }
    }

    static void transposeProcess(int[][] transpose) {
        System.out.println("\nYour Matris : ");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter width : ");
        width = input.nextInt();
        System.out.print("Enter length : ");
        length = input.nextInt();
        mainArray();

        //Nerede bu hata bulamadım..
    }
}
