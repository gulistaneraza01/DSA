package Basic;

public class StringBuilderDemo {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("raza");
        String name = "raza";
        String reverseName = "";

        System.out.println(name.length());

        for (int i = name.length() - 1; i >= 0; i--) {
            reverseName += name.charAt(i);
        }

        StringBuilder sb = new StringBuilder(name);
        System.out.println(sb.reverse());

        System.out.println(reverseName);
    }
}
