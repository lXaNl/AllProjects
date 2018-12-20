package Class.nested_interfaces;

public class MainTestForNestedInterfaces {

    public static void main(String[] args) {
        Nested.PublicNested publicNested =
                new PublicNestedImpl();

        publicNested.testPublic();

//        ==================================

        Nested nested = new Nested();
        Nested.NestedClassImpl nestedClass =
                nested.new NestedClassImpl();

        nestedClass.privateTestPublic();
    }

}
