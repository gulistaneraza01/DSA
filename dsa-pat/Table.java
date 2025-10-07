package Leetcode;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter table number=");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            sc.close();
            return;
        }
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d*%d=%d", num, i, num * i));
        }

        sc.close();
    }

}
