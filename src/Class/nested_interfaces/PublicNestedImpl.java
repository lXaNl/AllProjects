package Class.nested_interfaces;

public class PublicNestedImpl
        implements Nested.PublicNested {

    @Override
    public void testPublic() {
        System.out.println("Public Nested");
    }
}
