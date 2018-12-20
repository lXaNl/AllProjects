package Home.Lambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        /**
         * 	1. Получить из листа стрингов лист Integer-ов.
         */
        List<String> stringList = Arrays.asList("1","2","3","4","5","6");
        List<Integer> integerList = stringList.stream()
                .map(elem -> Integer.parseInt(elem))
                .collect(Collectors.toList());


        System.out.println(integerList);

        /**
         * 	2. Получить сумму всех нечётных чисел из списка.
         */


        List<Integer> oddList = integerList.stream().filter(elem -> elem%2==0).collect(Collectors.toList());
        System.out.println(oddList);

        /**
         * 	3. Вывести все элементы листа умноженные на 2.
         */

        oddList.forEach(integer -> System.out.print(integer*2+", "));

    }
}
