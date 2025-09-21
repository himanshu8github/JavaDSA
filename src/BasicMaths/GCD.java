package BasicMaths;

import java.util.Scanner;

public class GCD {
    // Recursive Euclidean Algorithm
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
        //a % b gives the remainder when a is divided by b.
        //if b = 0, then gcd(a, 0) = a.
        //So we keep replacing (a, b) with (b, a % b) until b = 0.
        //Let’s say we input:

        //a = 48, b = 18


       // gcd(48, 18)
//   → since b != 0 → return gcd(18, 48 % 18)
  // → 48 % 18 = 12
// → gcd(18, 12)

        //gcd(18, 12)
// → return gcd(12, 18 % 12)
//→ 18 % 12 = 6
// → gcd(12, 6)

      //  gcd(12, 6)
//→ return gcd(6, 12 % 6)
//→ 12 % 6 = 0
//→ gcd(6, 0)

       // gcd(6, 0) → since b == 0, return a = 6.

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("GCD of " + a + " and " + b + " = " + gcd(a, b));

        sc.close();
    }
}
