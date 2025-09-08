package Leetcode;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of fibonacci:");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;

        if (n == 1) {
            System.out.print(String.format("%d %n", a));
        }
        if (n >= 2) {

            System.out.print(String.format("%d %d ", a, b));
        }

        for (int i = 3; i <= n; i++) {

            int c = a + b;
            System.out.print(String.format("%d ", c));
            b = a;
            a = c;
        }

        System.out.println();

        sc.close();
    }
}
