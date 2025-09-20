package BasicMaths;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;

        if (n == 0) {
            count = 1; // Special case: 0 has 1 digit
        } else {
            n = Math.abs(n); // handle negative numbers
            while (n > 0) {
                n = n / 10;
                count++;
            }
        }

        System.out.println("Number of digits = " + count);

        sc.close();
    }
}
