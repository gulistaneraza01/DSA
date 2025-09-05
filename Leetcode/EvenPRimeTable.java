package Leetcode;

import java.util.Scanner;

public class EvenPRimeTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number:");
        int num = sc.nextInt();

        boolean isEven = checkedIsEven(num);
        if (isEven) {
            System.out.println(String.format("%d is even", num));
        } else {
            System.out.println(String.format("%d is not even", num));

        }

        boolean isPrime = checkedIsPrime(num);
        if (isPrime) {
            System.out.println(String.format("%d is prime", num));
        } else {
            System.out.println(String.format("%d is not prime", num));

        }

        printTable(num);

        sc.close();
    }

    private static void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d*%d=%d", num, i, num * i));
        }
    }

    private static Boolean checkedIsEven(int n) {
        return n % 2 == 0;
    }

    private static Boolean checkedIsPrime(int n) {
        boolean result = true;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                result = false;
            }
        }

        return result;
    }

}