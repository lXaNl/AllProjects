package Class.ExceptionsSTEP;

public class Assertions {

    public static int test(int x) {
        assert x>0;
        return x;
    }

    public static void main(String[] args) {
        System.out.println(test(1));
//        System.out.printf("age %d, salary %d", 25, 600);
    }
}
