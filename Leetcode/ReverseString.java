package Leetcode;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Raza";
        String reverseString = "";

        for (int i = name.length(); i > 0; i--) {
            reverseString += name.charAt(i - 1);
        }

        System.out.println(reverseString);

        StringBuilder sb = new StringBuilder("raza");

        for (int i = 0; i < sb.length() / 2; i++) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(sb.length() - i - 1));
            sb.setCharAt(sb.length() - i - 1, temp);
        }

        System.out.println(sb);
    }
}
