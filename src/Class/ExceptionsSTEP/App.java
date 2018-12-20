package Class.ExceptionsSTEP;

public class App {

    public static void test() throws Exception {
        System.out.println("TTT");
    }

    public static void test2() {
        try {
            test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        test2();
    }

}
