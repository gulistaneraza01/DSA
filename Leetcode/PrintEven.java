package Leetcode;

import java.util.Scanner;

public class PrintEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number to print up to even number:");
        int num = sc.nextInt();

        for (int i = 0; i <= num; i++) {
            if (num % 2 == 0) {
                if (i > num)
                    break;
                System.out.print(i + " ");
            }
        }

        // Start from 0, increment by 2 to print only even numbers up to num
        // for (int i = 0; i <= num; i += 2) {
        // System.out.print(i + " ");
        // }

    }
}
