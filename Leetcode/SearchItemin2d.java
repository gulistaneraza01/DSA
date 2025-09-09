package Leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class SearchItemin2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows:");
        int m = sc.nextInt();
        System.out.print("enter number of cols:");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(String.format("enter mat[%d][%d]:", i, j));
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("enter target value:");
        int target = sc.nextInt();
        // target value
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (target == matrix[i][j]) {
                    System.out.println(String.format("found at matrix[%d][%d]", i, j));
                }
            }

        }

        System.out.println(Arrays.deepToString(matrix));

        sc.close();
    }
}
