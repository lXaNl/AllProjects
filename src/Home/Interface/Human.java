package Home.Interface;

public abstract class Human implements Comparable {

    @Override
    public int compareTo(Object o) {
        return this.age - ((Human) o).age;
    }

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
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
