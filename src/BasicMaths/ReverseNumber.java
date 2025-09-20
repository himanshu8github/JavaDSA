package BasicMaths;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int N = sc.nextInt();

        int revNum = 0;
        int original = N;

        // handle negative numbers
        int sign = (N < 0) ? -1 : 1;
        N = Math.abs(N);

        while(N > 0){
            int lastDigit = N % 10;

            revNum = (revNum * 10) + lastDigit;
            N = N / 10;
        }
        revNum = revNum * sign; // restore sign if negative

        System.out.println("Reverse of " + original + " = " + revNum);
    }
}
