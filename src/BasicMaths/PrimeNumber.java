package BasicMaths;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int N = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(N + " is Prime");
        } else {
            System.out.println(N + " is Not Prime");
        }


    }
}

