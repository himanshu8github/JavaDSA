package JavaBasics;

import java.util.Scanner;

public class CalculatorProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            // take operator as input
            System.out.println("Enter operator (+, -, *, /, %, x to exit): ");
            char op = sc.next().trim().charAt(0);

            // exit condition
            if (op == 'x' || op == 'X') {
                System.out.println("Exiting calculator...");
                break;
            }

            // check valid operators
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter two numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                int ans = 0;

                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;
                } else if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero!");
                        continue; // skip this iteration
                    }
                } else if (op == '%') {
                    ans = num1 % num2;
                }

                System.out.println("Result: " + ans);
            } else {
                System.out.println("Invalid Operator");
            }
        }
    }
}
