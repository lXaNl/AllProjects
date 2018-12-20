package Class.comparable;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        User [] users = new User[3];
        users[0] = new User("Nigar", 21);
        users[1] = new User("Ali", 20);
        users[2] = new User("Ilkin", 29);

        users[0].compareTo(users[1]);

        Arrays.sort(users);

        System.out.println(Arrays.toString(users));
    }

}
