package Pattern;

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int rows = sc.nextInt();

        // 🔹 Upper pyramid
        for (int i = 1; i <= rows; i++) {
            // spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 🔹 Lower inverted pyramid
        for (int i = rows - 1; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
