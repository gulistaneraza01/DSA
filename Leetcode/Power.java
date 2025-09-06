package Leetcode;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number  X value:");
        int x = sc.nextInt();
        System.out.print("enter number  n value:");
        int n = sc.nextInt();
        double power = calPower(x, n);
        System.out.println(String.format("power of %d power %d is %.1f", x, n, power));
        sc.close();
    }

    private static double calPower(int n, int x) {
        return Math.pow(n, x);
    }
}
