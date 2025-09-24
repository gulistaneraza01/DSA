package Basic;

import java.util.LinkedList;

public class LinkedListCollection {
    public static void main(String[] args) {
        LinkedList<String> node = new LinkedList<>();
        node.add("my");
        node.add("name");
        node.add("is");
        node.add("gulistane raza");

        System.out.println(node);
        System.out.println(node.size());
        System.out.println(node.contains("my"));
        System.out.println(node.remove("is"));

        node.addFirst("hello,");
        node.add("hello,");
        System.out.println(node);
        System.out.println(node.get(1));

    }
}
