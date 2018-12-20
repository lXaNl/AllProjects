package Class.Lambda.stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExamples {

    public static void collectExample() {

        List<String> collect = Stream.of("A", "B")
                .collect(Collectors.toList());

        Stream stream;
        Thread thread;

    }

    public static void beforeMap() {
        List<String> list = new ArrayList<>();

        for (String s: Arrays.asList("a", "b", "Hello")) {
            String uppercase = s.toUpperCase();
            list.add(uppercase);
        }

        System.out.println(list);
    }

    public static void afterMap() {
        List<String> list = Stream.of("a", "b", "hello")
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(list);
    }

    public static void min() {
        List<Track> tracks = Arrays.asList(
                new Track("Shine", 5),
                new Track("Hele cavan oglanam", 3)
                );

        Track track = tracks.stream()
                .max(Comparator.comparing(
                        track1 -> track1.getLength()))
                .get();
    }

    public static void beforeReduce() {
        int acc = 0;

        for (Integer el: Arrays.asList(1, 2, 3)) {
            acc = acc + el;
        }

        System.out.println(acc);
    }

    public static void afterReduce() {
        int sum = Stream.of(1, 2, 3)
                .reduce(0, (acc, element) -> acc + element);
        System.out.println(sum);
    }

    public static void flatMapExample() {
        List<Integer> together =
                Stream.of(Arrays.asList(1, 2),Arrays.asList(3, 4))
                .flatMap(numbers -> numbers.stream())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
//        beforeMap();

//        afterMap();

        beforeReduce();

    }

}
