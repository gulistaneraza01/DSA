package Leetcode;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Raza";
        String reverseString = "";

        for (int i = name.length(); i > 0; i--) {
            reverseString += name.charAt(i - 1);
        }

        System.out.println(reverseString);
    }
}
