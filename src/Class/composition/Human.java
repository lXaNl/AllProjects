package Class.composition;

public class Human {
    private String name;

    private int age;

    private Body body;

    public Human(String name, int age, Body body) {
        this.name = name;
        this.age = age;
        this.body = body;
    }

    public Human() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", body=" + body +
                '}';
    }
}
