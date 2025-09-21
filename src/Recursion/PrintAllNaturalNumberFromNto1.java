package Recursion;

import java.util.Scanner;

public class PrintAllNaturalNumberFromNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        PrintallNumber(n);

    }

    static void PrintallNumber(int n){
        //base case
        if(n == 1){
            System.out.print(1);
            return;
        }
        // self
        System.out.print(n);


        // recursive work
        PrintallNumber(n-1 );  // n-1, n-2, ...... 1

    }
}
