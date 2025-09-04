package Leetcode;

import java.util.Scanner;

public class SumofN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number of find sum");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }

        System.out.println(String.format("sum of first %d is %d:", num, sum));

    }
}
