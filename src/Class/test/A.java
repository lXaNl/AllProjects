package Class.test;

public interface A {

    void testPrint();

    static int sum(int a, int b) {
        return a + b;
    }

    default void classDescription() {
        System.out.println(getClass().getSimpleName());
    }

}
