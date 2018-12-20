package Class.Lambda;

import java.io.IOException;
import java.util.*;

public class LambdaExamples {

    public static void test() {

    }

    public static void main(String[] args) {
      test();
    }

    public static void ownInterfaceExample() {
        TestClass testClass = new TestClass();

        testClass.testLambda(new FunctionalInterfaceExample() {
            @Override
            public void test() {
                System.out.println("AAAAAA");
            }
        });

        testClass.testLambda(() -> System.out.println("sdsdsds"));
        List<String> stringList = Arrays.asList("abc","def","ghi");

        boolean isTrue = stringList.stream().anyMatch(s -> s.startsWith("a"));


    }







    public static void lambdaEx() {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        };

        String[] names = {"Cabrail", "Ali", "Chingiz"};

//        Arrays.sort(names, comparator);

        System.out.println(Arrays.toString(names));

//        JAVA 8
        Comparator<String> comparator1 =
                (o1, o2) -> o1.length() - o2.length();

        Comparator<String> comparator2 =
                Comparator.comparingInt(String::length);

        Arrays.sort(names, comparator1);

        System.out.println(Arrays.toString(names));
    }



}
