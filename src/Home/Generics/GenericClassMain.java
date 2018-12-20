package Home.Generics;

public class GenericClassMain {

    public static void main(String[] args) {

        Integer[] arr = {1,2,3,4,5};
        GenericClass<Integer> genericClass = new GenericClass<>();
        System.out.println(genericClass.compare(arr));

    }

}
