package Leetcode;

import java.util.Scanner;

public class AddTwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a=");
        int a = sc.nextInt();
        System.out.print("enter b=");
        int b = sc.nextInt();

        int result = addSum(a, b);
        int result1 = calMulti(a, b);

        System.out.println(String.format("sum of %d+%d is %d", a, b, result));
        System.out.println(String.format("multi of %d*%d is %d", a, b, result1));
        sc.close();
    }

    public static int addSum(int a, int b) {
        return a + b;
    }

    public static int calMulti(int a, int b) {
        return a * b;
    }
}
