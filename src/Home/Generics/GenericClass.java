package Home.Generics;

public class GenericClass<T> {

    public static <T extends Comparable> GenericForClass<T> compare(T[] arr) {

        if (arr == null || arr.length == 0) return null;

        T min=arr[0];
        T max=arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min.compareTo(arr[i])>0) min=arr[i];
        }

        for (int i = 1; i < arr.length; i++) {
            if (max.compareTo(arr[i])<0) max=arr[i];
        }

        return new GenericForClass<T> (min,max);

    }

}
