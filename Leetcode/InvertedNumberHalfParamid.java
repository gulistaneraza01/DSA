package Leetcode;

import java.util.Scanner;

public class InvertedNumberHalfParamid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of line to display half Pramid:");

        int n = sc.nextInt();

        for (int i = n; i > 0; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
