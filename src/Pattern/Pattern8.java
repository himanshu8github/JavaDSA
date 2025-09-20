package Pattern;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows: ");
        int rows = sc.nextInt();

        for(int i = 1; i <= rows ; i++){
            //for printing space
            for(int j = 1; j <= rows - i - 1; j++){
                System.out.print(" ");
            }
            //for printing stars
            for(int j = 0; j < 2 * i - 1; j++){
                System.out.print("* ");
            }
            //for printing space
            for(int j = 1; j <= rows - i - 1; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
