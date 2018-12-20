package Home.Interface;

import java.util.Comparator;

public class StudentComparator implements Comparator {

    @Override
    public int compare(Object human1, Object human2) {
            return (((Student)human1).getAverage() - ((Student)human2).getAverage());
    }

}
