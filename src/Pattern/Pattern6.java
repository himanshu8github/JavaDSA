package Pattern;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows : ");
        int rows = sc.nextInt();

        for(int i = 1; i <= rows; i++){
            for(int j = 0; j < rows - i + 1 ; j++){
                System.out.print( "* ");
            }
            System.out.println();
        }
    }
}
