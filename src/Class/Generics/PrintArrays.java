package Class.Generics;

public class PrintArrays<T> {
    public T [] arr;

    public static <T> void printArray(T[] arr) {
        for (T a :
                arr) {
            System.out.println(a);
        }

    }


    public static <T extends Comparable> Pair<T> compare(T [] arr){

        if (arr == null || arr.length==0 ) return null;

        T min = arr[0];
        T max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min.compareTo(arr[i])>0) min = arr[i];
        }

        for (int i = 1; i < arr.length; i++) {
            if (max.compareTo(arr[i])<0) max = arr[i];
        }

        return new Pair<T>(min, max);
    }



    public static void main(String[] args) {
        Integer[] arrs ={1,2,3};
        printArray(arrs);
        String [] arrr = new String[5];

        Integer[] arr = {1,2,3,4,5};
        String [] ar = {"123","abc"};
        System.out.println(compare(ar));

    }
}
