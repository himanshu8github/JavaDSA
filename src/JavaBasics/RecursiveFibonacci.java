package JavaBasics;

public class RecursiveFibonacci {

    static int fib(int n) {
        if (n <= 1) return n;            // Base case
        return fib(n - 1) + fib(n - 2);  // Recursive case
    }

    public static void main(String[] args) {
        int num = 7;
        for (int i = 0; i < num; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
