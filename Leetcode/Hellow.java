package Leetcode;

abstract class Animal {
    abstract void walk();
}

class Lion {
    public void walk() {
        System.out.println("have 4 legs");
    }

    protected static String name = "raza";
}

public class Hellow {
    static void printHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        System.out.println(Lion.name);
        printHello();
    }
}