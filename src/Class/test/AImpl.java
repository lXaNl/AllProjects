package Class.test;

public class AImpl implements A {
    @Override
    public void testPrint() {
        System.out.println("TROLOLO");
    }

    @Override
    public void classDescription() {
        System.out.println(getClass().getSimpleName() + " OK");
    }


    public static void main(String[] args) {
        A a = new AImpl();

        a.classDescription();

    }
}
