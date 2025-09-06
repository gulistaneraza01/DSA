package Leetcode;

import java.util.Scanner;

public class Eligiable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter you age:");
        int age = sc.nextInt();

        boolean res = isEligiable(age);
        if (res) {
            System.out.println("he can vote");

        } else {
            System.out.println("he cann't vote");

        }

        sc.close();
    }

    private static boolean isEligiable(int age) {
        boolean res = age < 18 ? false : true;
        return res;
    }
}
