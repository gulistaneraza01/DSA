package Basic;

import java.util.Scanner;

public class ConditionalOperator {
    public static void main(String[] args) {
        int a = 4;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter day one to seven:");
        String b = sc.nextLine();

        switch (b) {
            case "one":
                System.out.println("sunday");
                break;
            case "two":
                System.out.println("monday");
                break;
            case "three":
                System.out.println("sunday");
                break;
            case "four":
                System.out.println("monday");
                break;
            case "five":
                System.out.println("monday");
                break;
            case "six":
                System.out.println("sunday");
                break;
            case "seven 8":
                System.out.println("monday");
                break;
            default:
                System.out.println("not valid input");
                break;
        }

    }

}
