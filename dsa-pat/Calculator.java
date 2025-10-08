// package dsa_pat;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0, b = 0;
        String symbol = "";
        try {
            System.out.print("enter a value:");
            a = sc.nextInt();
            System.out.print("enter b value:");
            b = sc.nextInt();

            System.out.print("enter an operator (+, -, *, /, %): ");
            symbol = sc.next();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values.");
            sc.close();
            return;
        }

        switch (symbol) {
            case "+":
                int add = a + b;
                System.out.println(String.format("Sum of two numbers is %d", add));
                break;
            case "-":
                int sub = a - b;
                System.out.println(String.format("Difference of two numbers is %d", sub));
                break;
            case "*":
                int multi = a * b;
                System.out.println(String.format("Product of two numbers is %d", multi));
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Error: Division by zero");
                } else {
                    double div = (double) a / b;
                    System.out.println(String.format("Quotient of two numbers is %.2f", div));
                }
                break;
            case "%":
                if (b == 0) {
                    System.out.println("Error: Modulo by zero");
                } else {
                    int rem = a % b;
                    System.out.println(String.format("Remainder of two numbers is %d", rem));
                }
                break;
            default:
                System.out.println("Invalid operator. Please use +, -, *, /, or %");
                break;
        }

        sc.close();
    }
}
