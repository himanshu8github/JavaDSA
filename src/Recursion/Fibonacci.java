package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Answer is : " + fib(6));

    }

    static int fib(int n){
        //base case
      if(n == 0 || n == 1){
          return n;
      }

      return fib(n-1) + fib(n-2);

//      int prev = fib(n-1);
//      int preprev = fib(n-2);
//
//      return prev + preprev;


    }
}
