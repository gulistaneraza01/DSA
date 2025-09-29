package Basic;

import java.util.Arrays;
import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("name", "raza");
        map.put("rollno", "01");
        map.put("address", "bangalore");

        Object name = map.get("name");
        Object one = map.get(1);
        System.out.println(map.containsKey("name"));

        // System.out.println(name);

        for (Object key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }

        map.remove("name");
        System.out.println(map);

    }
}
