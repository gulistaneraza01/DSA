package Leetcode;

import java.util.Scanner;

public class IsEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("enter number:");
            int num = sc.nextInt();

            int isPrime = 1;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = 0;
                    break;
                }
            }

            if (isPrime == 1) {
                System.out.println(String.format("%d is prime number", num));
            } else {
                System.out.println("hello");
                System.out.println(String.format("%d is not prime number", num));
            }
        } finally {
            sc.close();
        }
    }
}
