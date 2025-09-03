package Leetcode;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :");
        int num = sc.nextInt();

        if (num % 2 != 0) {
            System.out.println(String.format("%d is odd number", num));
        } else {
            System.out.println(String.format("%d is even number", num));
        }
    }

}
