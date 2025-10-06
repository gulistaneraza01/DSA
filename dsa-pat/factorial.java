package Leetcode;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter factorial number:");
        int num = sc.nextInt();

        if (num < 0) {
            System.out.println("Wrong input");
        } else if (num == 0) {
            System.out.println("factorial of o is 1");
        } else {
            int fact = calFactorial(num);
            System.out.println(String.format("factorail of %d is %d", num, fact));
        }

        sc.close();
    }

    private static int calFactorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

}
