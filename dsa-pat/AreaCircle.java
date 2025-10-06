package Leetcode;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter radius value:");
        int r = sc.nextInt();

        double area = calArea(r);
        System.out.println(String.format("area of cicle=%.2f", area));
        double circum = calCircum(r);
        System.out.println(String.format("curcumference of cicle=%.2f", circum));
        sc.close();
    }

    private static double calArea(int r) {

        return 3.14 * r * r;
    }

    private static double calCircum(int r) {
        return 2 * 3.14 * r;
    }
}
