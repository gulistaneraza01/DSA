package Leetcode;

import java.util.Scanner;

public class GreaterBetweenTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a value:");
        int a = sc.nextInt();
        System.out.print("enter b value:");
        int b = sc.nextInt();

        int grater = greaterNumer(a, b);
        System.out.println(String.format("greater value between %d nad %d is %d", a, b, grater));
        sc.close();
    }

    private static int greaterNumer(int a, int b) {
        int grater = a > b ? a : b;
        return grater;
    }

}
