package Leetcode;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter a value:");
        int a = sc.nextInt();
        System.out.print("enter b value:");
        int b = sc.nextInt();
        System.out.print("enter c value:");
        int c = sc.nextInt();

        double result = calAvg(a, b, c);

        System.out.println(String.format("Average number %d %d %d is %.1f", a, b, c, result));
        sc.close();
    }

    private static double calAvg(int a, int b, int c) {
        double avg = (a + b + c) / 3;
        return avg;
    }

}
