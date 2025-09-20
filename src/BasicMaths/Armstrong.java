package BasicMaths;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int N = sc.nextInt();

        int original = N;
        int sum = 0;

        while (N > 0) {
            int lastDigit = N % 10;
            sum = sum + (lastDigit * lastDigit * lastDigit);
            N = N / 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is NOT an Armstrong number.");
        }


    }
}
