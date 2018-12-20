package Class.nested_interfaces;

public class Nested {

    public interface PublicNested {
        void testPublic();
    }

    private interface PrivateNested {
        void privateTestPublic();
    }

    public class NestedClassImpl implements PrivateNested {

        @Override
        public void privateTestPublic() {
            System.out.println("Private nested " +
                    "interface impl");
        }
    }
}