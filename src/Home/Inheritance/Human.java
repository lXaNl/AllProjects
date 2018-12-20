package Home.Inheritance;

public abstract class  Human {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    abstract String getDescription();

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Human() {
    }

    @Override
    public String toString() {
        return "Home.Inheritance.Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
