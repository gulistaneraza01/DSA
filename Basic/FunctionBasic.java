package Basic;

import java.util.Scanner;

public class FunctionBasic {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter your full name:");
    String name = sc.nextLine();

    functionhello(name);

  }

  public static void functionhello(String name) {
    System.out.println("hello from " + name);
    return;
  }
}
