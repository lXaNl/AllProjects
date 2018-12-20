package Class.company;

public abstract class Human {

    private String name;

    abstract String getDescription();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human(String name) {
        this.name = name;
    }

    public Human() {
        System.out.println("Human");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "name='" + name + '\'' +
                '}';
    }


}
