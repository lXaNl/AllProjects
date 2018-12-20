package Home.Interface;

public class Student extends AcademyStaff {
    private int average;

    public int getAverage() {
        return average;
    }

    @Override
    String getDescription() {
        return "Home.Inheritance.Student";
    }

    public Student(String name, int age ,int average) {
        super(name, age);
        this.average=average;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                " average=" + average +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return super.compareTo(o);
    }


}
