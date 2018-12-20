package Class.ExceptionsSTEP;

public class Test {

    public static int parseInteger(String s)
            throws NumberFormatException {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {

        int a = parseInteger("sss");
        System.out.println(a);
    }

}
