package Basic;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows:");
        int m = sc.nextInt();
        System.out.print("enter number of cols:");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(String.format("enter mat[%d][%d]", i, j));
                matrix[i][j] = sc.nextInt();
            }
        }

        // printmatrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(String.format("%d ", matrix[i][j]));
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(matrix));

        sc.close();
    }
}
