package Home.Inheritance;

public class Student extends AcademyStaff {
    private double average;

    public double getAverage() {
        return average;
    }

    @Override
    String getDescription() {
        return "Home.Inheritance.Student";
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Home.Inheritance.Student{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                " average=" + average +
                '}';
    }
}
