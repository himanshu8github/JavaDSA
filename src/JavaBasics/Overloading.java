package JavaBasics;

public class Overloading {

    public static void main(String[] args) {
//    fun(65);
    fun("hellooooo");


        sum(5,566,5);
    }

    static int sum(int a, int b){
        return a + b;
    }

    static int sum(int a, int b, int c){
        return a + b + c;
    }

    static void fun(int a){
        System.out.println("First one");
        System.out.println(a);
    }

    static void fun(String a){
        System.out.println("Second one");
        System.out.println(a);
    }
}
