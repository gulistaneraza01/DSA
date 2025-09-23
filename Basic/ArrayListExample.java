package Basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> strList = new ArrayList<>();
        ArrayList<Boolean> newList = new ArrayList<>();

        strList.add("raza");
        System.out.println(strList);
        System.out.println(newList);

        list.add(23);
        list.add(4);
        list.add(3);
        list.add(1);
        list.add(9);

        System.out.println(list.get(4));
        System.out.println(list.size());
        int num = list.set(0, 3);

        // list.remove(list.size() - 1);

        list.add(1, 98);
        System.out.println(list);
        System.out.println(num);

        // for (int i = 0; i < list.size(); i++) {
        // System.out.println(list.get(i));
        // }

        // for (int item : list) {
        // System.out.println(item);
        // }

        Collections.sort(list);

        System.out.println(list);

    }
}
