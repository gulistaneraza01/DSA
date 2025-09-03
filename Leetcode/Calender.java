package Leetcode;

import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number to display month of the year:");
        int month = sc.nextInt();

        switch (month) {
            case 1: {
                System.out.println("Current month is Jan");
                break;
            }
            case 2: {
                System.out.println("Current month is feb");
                break;
            }
            case 3: {
                System.out.println("Current month is mar");
                break;
            }
            case 4: {
                System.out.println("Current month is apr");
                break;
            }
            case 5: {
                System.out.println("Current month is may");
                break;
            }
            case 6: {
                System.out.println("Current month is jun");
                break;
            }
            case 7: {
                System.out.println("Current month is jul");
                break;
            }
            case 8: {
                System.out.println("Current month is aug");
                break;
            }
            case 9: {
                System.out.println("Current month is sep");
                break;
            }
            case 10: {
                System.out.println("Current month is oct");
                break;
            }
            case 11: {
                System.out.println("Current month is nov");
                break;
            }
            case 12: {
                System.out.println("Current month is dec");
                break;
            }
            default: {
                System.out.println("invalid input");
            }
        }
    }
}
