package Home.Interface;

import java.util.Comparator;

public class Teacher extends AcademyStaff {
    private int salary;
    private int experience;

    public int getExperience() {
        return experience;
    }


    @Override
    String getDescription() {
        return "Teacher";
    }

    @Override
    boolean isTeacher() {
        return true;
    }

    public int getSalary() {
        return salary;
    }

    public Teacher(String name, int age, double salary, int experience) {
        super(name, age);
        this.salary = (int) salary;
        this.experience = experience;
    }

    public Teacher() {
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                " salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return super.compareTo(o);
    }

    public abstract class NestedTeacher implements Comparator {


        @Override
        public int compare(Object human1, Object human2) {
            return ((Teacher) human1).getExperience() - ((Teacher) human2).getExperience();
        }
    }

}
