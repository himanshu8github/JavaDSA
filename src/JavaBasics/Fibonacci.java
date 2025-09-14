package JavaBasics;

import java.util.Scanner;

public class Fibonacci {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();

        int a = 0; // store prev fibo no
        int b = 1;  // store current fibo no
        int count = 2;

        while(count <= num){
            int temp = b;   // store current val of b in temp var
            b = b + a;  //Update b as b + a (Fibonacci formula: F(n) = F(n-1) + F(n-2)).
            a = temp;
            count++;

        }
        System.out.println(b);
    }
}
