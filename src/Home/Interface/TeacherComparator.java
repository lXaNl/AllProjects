package Home.Interface;

import java.util.Comparator;

public class TeacherComparator implements Comparator {

    @Override
    public int compare(Object human1, Object human2) {
        return ((Teacher) human1).getSalary()  - ((Teacher) human2).getSalary();
    }



}