package Class.conflict;

public interface Person {

    default String getName() {
        return "Person";
    }

}
