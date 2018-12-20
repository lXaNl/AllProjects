package Class.Collections;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(5);
        linkedList.add(2);
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(7);

        linkedList.remove();
        linkedList.removeLast();
        linkedList.removeFirstOccurrence(7);
        linkedList.addFirst(10);
        Integer i = linkedList.get(2);
        System.out.println(linkedList);

    }

}
