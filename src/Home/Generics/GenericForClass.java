package Home.Generics;

public class GenericForClass<T> {
    private T first;
    private T second;

    public GenericForClass(T id, T salary) {
        this.first = id;
        this.second = salary;
    }

    @Override
    public String toString() {
        return "GenericForClass{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
