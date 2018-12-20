package Class.ExceptionsSTEP;

public class FinallyTest {

    public static int f(int n) {
        try {
            int r = n*n;
            System.out.println(r);
            return r;
        } finally {
            if (n == 2) {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(f(2));
    }

}
