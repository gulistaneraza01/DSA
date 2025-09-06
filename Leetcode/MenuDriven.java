package Leetcode;

import java.util.Scanner;

public class MenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("enter option b/w 0 and 1:");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("enter your marks:");
                    int marks = sc.nextInt();
                    System.out.println(marks);
                    break;
                case 0:
                    break;

                default:
                    break;
            }
            if (option == 0) {
                break;
            }
            sc.close();
        }

    }

}
