package Class.comparator;

import java.util.Comparator;

public class LengthComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {

        if (o1.getClass() != String.class &&
                o2.getClass() != String.class)
            throw new ClassCastException();

        String s1 = (String) o1;
        String s2 = (String) o2;

        return s1.length() - s2.length();
    }
}
