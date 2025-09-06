package Leetcode;

import java.util.Scanner;

public class OddSumFun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number to generate odd number:");
        int n = sc.nextInt();
        int oddSum = calOdd(n);
        System.out.println(String.format("sum of %d odd is %d", n, oddSum));
    }

    private static int calOdd(int n) {
        int oddSum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                oddSum += i;
            }
        }

        return oddSum;
    }
}
