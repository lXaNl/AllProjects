package Class.comparator;

import java.util.Arrays;
import java.util.Comparator;

public class MainTestLengthComparator {

    public static void main(String[] args) {
        Comparator comparator = new LengthComparator();
        String[] friends = {"Nigar", "Ali", "Vusal", "Ilkin"};

//        Arrays.sort(friends);
        Arrays.sort(friends, comparator);
//        Arrays.sort(friends, new LengthComparator());

        System.out.println(Arrays.toString(friends));
    }

}
