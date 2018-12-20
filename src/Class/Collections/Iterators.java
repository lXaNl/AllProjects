package Class.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class Iterators {

    public static void iteratorExample() {
        Collection<String> collection = new ArrayList<>();

        collection.add("Nigar");
        collection.add("Ali");
        collection.add("Vusal");

        Iterator<String> iterator = collection.iterator();

//        User user = new User();
//        String name = user.getName();

        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }

    public static void iteratorRemove() {
        Collection<String> collection = new ArrayList<>();

        collection.add("Nigar");
        collection.add("Ali");
        collection.add("Ali");
        collection.add("Ali");
        collection.add("Vusal");

        Iterator<String> iterator = collection.iterator();

//        for (String name : collection) {
//            if (name.equals("Ali")) {
//                collection.remove(name);
//            }
//        }

        iterator.next();
        iterator.next();
        iterator.remove();
        System.out.println(collection);
    }

    public static void iteratorException() {
        Collection<String> collection = new ArrayList<>();

        collection.add("Nigar");
        collection.add("Ali");
        collection.add("Ali");
        collection.add("Ali");
        collection.add("Vusal");

        Iterator<String> iterator1 = collection.iterator();

        Iterator<String> iterator2 = collection.iterator();

        iterator1.next();
        iterator1.remove();
        iterator2.next();
        System.out.println(collection);


    }

    public static void iterableExample() {
        Collection<String> collection = new ArrayList<>();

        collection.add("Nigar");
        collection.add("Ali");
        collection.add("Vusal");

        for (String name : collection) {
            System.out.println(name);
        }
    }

    public static void scannerExample() {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String next = scanner.next();

            System.out.println(next);
            if (next.equals("404")) {
                break;
            }
        }
    }

    public static void main(String[] args) {
//        iteratorExample();

//        iteratorRemove();

//        iteratorException();

//        scannerExample();
    }

}
