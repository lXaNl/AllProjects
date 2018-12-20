package Class.Collections.queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

    public static void simpleExample() {
        Queue<Integer> integers = new PriorityQueue<>();

        integers.add(5);
        integers.add(7);
        integers.add(1);
        integers.add(10);

//        integers.remove();

        Integer i = integers.poll();
        System.out.println(i);

        integers.peek();

        System.out.println(integers);
    }

    public static void main(String[] args) {
        simpleExample();

        Queue<User> userQueue = new PriorityQueue<>(
                new Comparator<User>() {
                    @Override
                    public int compare(User o1, User o2) {
                        return o1.getId() - o2.getId();
                    }
                }
        );
    }

}
