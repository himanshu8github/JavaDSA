package Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Answer is : ");
        System.out.println(fact1(5));
//        System.out.println(fact(5));


    }

    static int fact1(int n){
        if(n == 0) return 1;
        return n * fact1(n-1);
    }

//    static int fact(int n){
//
//        // base case
//        if(n == 0) return 1;
//
//        // recursive call
//        int ans = fact(n-1);
//        int newAns = n * ans;
//        return newAns;
//
//    }
}
