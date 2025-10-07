package Leetcode;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a value:");
        int a = sc.nextInt();
        System.out.print("enter b value:");
        int b = sc.nextInt();

        System.out.print("enter an operator (+, -, *, /, %): ");
        String symbol = sc.next();

        switch (symbol) {
            case "+": {
                int add = a + b;
                System.out.println(String.format("add of two number is %d", add));
                break;
            }
            case "-": {
                int sub = a - b;
                System.out.println(String.format("sub of two number is %d", sub));
                break;
            }
            case "*": {
                int multi = a * b;
                System.out.println(String.format("multi of two number is %d", multi));
                break;
            }
            case "/": {
                double div = a / b;
                System.out.println(String.format("div of two number is %.2f", div));
                break;
            }
            case "%": {
                int rem = a % b;
                System.out.println(String.format("rem of two number is %d", rem));
                break;
            }

            default:
                System.out.println("wrong System");
                break;
        }

        sc.close();

    }
}
