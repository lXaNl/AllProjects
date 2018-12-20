package Class.Lambda.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterExample {

    public static void before() {
        long startTime = System.currentTimeMillis();

        List<String> list = Arrays.asList("A", "B", "C");

        List<String> result = new ArrayList<>();

        for (String line: list) {
            if (!line.equals("A")) {
                result.add(line);
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Отработал за время: "
                + (endTime - startTime));

        for (String res : result) {
            System.out.println(res);
        }
    }

    public static void after() {
        long startTime = System.nanoTime();

        List<String> list = Arrays.asList("A", "B", "C");

        String onlyC = list.stream()
                .filter(letter -> letter.equals("C"))
                .findAny()
                .orElse(null);


        List<String> result2 = new ArrayList<>();

//        list.forEach(l -> {
//            if (!l.equals("A")) {
//                result2.add(l);
//            }
//        });



        List<String> result = list.stream()
                .filter(line -> !line.equals("A"))
                .collect(Collectors.toList());

        long endTime = System.nanoTime();
        System.out.println(" Stream Отработал за время: "
                + (endTime - startTime));

        long startTime1 = System.nanoTime();

        List<String> parallelResult = list.parallelStream()
                .filter(line -> !line.equals("A"))
                .collect(Collectors.toList());

        long endTime1 = System.nanoTime();
        System.out.println(" Stream Отработал за время: "
                + (endTime1 - startTime1));
    }

    public static void main(String[] args) {
//        before();
        after();
    }

}
