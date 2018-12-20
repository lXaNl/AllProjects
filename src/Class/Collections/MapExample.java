package Class.Collections;

import Class.Collections.queue.User;

import java.util.*;

public class MapExample {

    public static void hashMapExample() {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Nigar");
        map.put(2, "Chingiz");

        map.putIfAbsent(3, "Nigar");

        String s = map.get(1);
        String s1 = map.getOrDefault(4, "NO ELEMENT");

        System.out.println(s);
        System.out.println(s1);

        System.out.println(map);


//        ================

        Set<Integer> keys = map.keySet();

        System.out.println(keys);

        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            if (entry.getValue().equals("Nigar")) {
                System.out.println("OK");
            }
        }
    }

    public static void main(String[] args) {
//        treeExample();
        hashMapExample();

    }

    public static void treeExample() {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(1, "Ali");
        map.put(3, "Nigar");
        map.put(2, "Cabrail");

        System.out.println(map);
    }

}
