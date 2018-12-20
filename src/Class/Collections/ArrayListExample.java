package Class.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();

        /**
         * Увеличивает емкость
         */
        list.ensureCapacity(10);

        /**
         * Проверка не пустой ли список
         */

        boolean empty = list.isEmpty();
        System.out.println(empty);
        System.out.println("*************");

        /**
         * Добавление
         */
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        System.out.println(list);
        System.out.println("*************");

        /**
         * Добавление коллекции
         */
        List<Integer> list2 = Arrays.asList(1, 2, 3);
//        list.addAll(list2);
        list.addAll(0, list2);

        System.out.println(list);
        System.out.println("*************");

        /**
         * Удаление по индексу
         */
        list.remove(0);
        System.out.println(list);
        System.out.println("*************");

        /**
         * Удаление по значению. Удаляет первый найденный
         */
        list.remove(Integer.valueOf(8));

        System.out.println(list);
        System.out.println("*************");

        /**
         *  Нахождение по значению
         *  Возвращает индекс первого найденного
         *  Если не найдет то -1
         */
        int first = list.indexOf(3);
        System.out.println(first);
        System.out.println("*************");

        /**
         * Нахождение по индексу
         */
        Integer element = list.get(1);
        System.out.println(element);
        System.out.println("*************");

        /**
         * Размер
         */
        int size = list.size();
        System.out.println(size);
        System.out.println("*************");

        /**
         * Удаление с removeAll
         */
        List<Integer> list3 = Arrays.asList(5, 6);
        list.removeAll(list3);
        System.out.println(list);
        System.out.println("*************");

        /**
         * Нахождение макс элемента
         * К КОЛЛЕКЦИЯМ НЕ ОТНОСИТСЯ
         */
        Integer max = Collections.max(list);
        Integer min = Collections.min(list);
        System.out.println(max);
        System.out.println(min);
        System.out.println("*************");

        /**
         * Clear
         */
        list.clear();
        System.out.println(list);

    }

}
