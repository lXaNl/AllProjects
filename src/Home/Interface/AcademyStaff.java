package Home.Interface;

public class AcademyStaff extends Human {
    @Override
    String getDescription() {
        return "Academy Staff";
    }
    boolean isTeacher(){
        return false;
    }

    public AcademyStaff(String name, int age) {
        super(name, age);
    }

    public AcademyStaff() {
    }

    @Override
    public String toString() {
        return "Home.Inheritance.AcademyStaff{" +
                "name='" + super.getName() + '\'' +
                ", age=" + super.getAge() +
                "}";
    }
}
