package Class.Lambda.stream_api;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {

    public static void beforeJava8() {
        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("D");
        list.add("E");
        list.add("F");

        for (String letter: list) {
            if (letter.equals("A")) {
                System.out.println(letter);
            }
        }
    }

    public static void afterJava8() {
        List<String> list = new ArrayList<>();

        list.add("A");
        list.add("D");
        list.add("E");
        list.add("F");

        list.forEach(letter -> {
            if (letter.equals("A")) {
                System.out.println(letter);
            }
        });

    }

    public static void main(String[] args) {
        beforeJava8();
    }

}
