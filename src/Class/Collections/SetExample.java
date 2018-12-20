package Class.Collections;

import java.util.*;

public class SetExample {

    public static void hashSetExample() {

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(1);
        integers.add(10);

//        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set = new HashSet<>(integers);

        set.add(1);
        set.add(1);
        set.add(1);
        set.add(2);

        System.out.println(set);
    }

    public static void main(String[] args) {
        hashSetExample();
        treeSetExample();
    }

    public static void treeSetExample() {
        Set<String> strings = new TreeSet<>();

        strings.add("Bob");
        strings.add("Alex");
        strings.add("Carl");

        for (String name: strings) {
            System.out.println(name);
        }
    }

}
