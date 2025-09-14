package JavaBasics;

import java.util.Scanner;

public class ForLoop {


    public static void main(String[] args) {

//        for(int n = 1; n <= 5; n += 1){
//            System.out.println(n);
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int num = sc.nextInt();

        for(int i = 1; i <= num; i++){
            System.out.print(i + "");
        }
    }
}
