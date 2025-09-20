package BasicMaths;

import java.util.Scanner;

public class CheckPallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number : ");
        int N = sc.nextInt();

        int revNum = 0;
        int original = N;

        while(N > 0){
            int lastDigit = N % 10;
            revNum = (revNum * 10) + lastDigit;
            N = N / 10;
        }
        if(original == revNum){
            System.out.println("Pallindrome");
        }else{
            System.out.println("Not pallindrome");
        }
    }
}
