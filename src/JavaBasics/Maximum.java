package JavaBasics;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Maximum {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }

        System.out.println("max value is : " + max);
    }
}
