package Basic;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("enter a:");
            int a = sc.nextInt();

            System.out.print("enter b:");
            int b = sc.nextInt();

            int result = a + b;

            System.out.println("sum of two number:" + result);

            sc.close();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}