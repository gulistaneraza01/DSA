package Leetcode;

import java.util.Scanner;

public class Gcd {
    // Optimized using Euclidean algorithm with recursion
    public static int gcd(int a, int b) {
        if (b == 0)
            return Math.abs(a);
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number a=");
        int a = sc.nextInt();
        System.out.print("enter number b=");
        int b = sc.nextInt();

        int gcd;
        while (true) {
            int rem = b % a;
            if (rem == 0) {
                gcd = a;
                break;
            }
            b = a;
            a = rem;
        }

        System.out.println(String.format("gcd of %d %d is %d", a, b, gcd));

        sc.close();
    }
}
