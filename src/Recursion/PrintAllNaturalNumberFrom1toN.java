package Recursion;

import java.util.Scanner;

public class PrintAllNaturalNumberFrom1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();

        PrintallNumber(n);

    }

    static void PrintallNumber(int n){
        if(n == 1){
            System.out.print(1);
            return;
        }
        PrintallNumber(n-1 );
        System.out.print(n);
    }
}
