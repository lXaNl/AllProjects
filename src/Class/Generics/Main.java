package Class.Generics;

public class Main {

    public void doIt(){
        GenericEmployee<Integer,String> employee =
                new GenericEmployee<Integer, String>(5,500,"John","Frederic");
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.doIt();
        GenericEmployee<Integer,String> employee = new GenericEmployee<Integer, String>(1,1000,"beqi","dolb");
        System.out.println(employee.toString());

    }
}
