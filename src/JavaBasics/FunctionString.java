package JavaBasics;

import java.util.Scanner;

public class FunctionString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name : ");
        String pronounce = sc.next();
        String person = myGreet(pronounce);
        System.out.println(person);

    }

    static String myGreet(String name){
        String msg = "Hello " + name;
        return msg;
    }
}
