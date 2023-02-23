package Arrays;

import java.util.Scanner;

public class PrintingtheLetter_B {
    static Scanner input = new Scanner(System.in);
    static int width, length;

    static void process() {
        String[][] letterCreate = new String[length][width];

        for (int i = 0; i < letterCreate.length; i++) {
            for (int j = 0; j < letterCreate[i].length; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    letterCreate[i][j] = " * ";
                } else if (j == 0 || j == 3) {
                    letterCreate[i][j] = " * ";
                } else {
                    letterCreate[i][j] = "   ";
                }
            }
        }
        for (String[] row : letterCreate){
            for (String col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter width : ");
        width = input.nextInt();
        System.out.print("Enter length : ");
        length = input.nextInt();
        process();

    }
}
