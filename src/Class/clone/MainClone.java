package Class.clone;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MainClone {

    public static void main(String[] args) {

        String [] strings = {"A", "B", "C"};

//        String [] strings1 = strings;

//        strings1[0] = "D";
//
//        System.out.println(Arrays.toString(strings));

        String [] strings2 = strings.clone();

        strings2[0] = "D";

        System.out.println(Arrays.toString(strings));
    }

}
