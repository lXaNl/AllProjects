package Class.Collections;

import java.util.*;

public class Test <T> {

    public void test() {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            T t = (T) sc.next();
            System.out.println(t);
            if (t.equals("404") ) break;
        }
    }
    public static void main(String[] args) {

//        Collection<String> collection = new ArrayList<>();
//        collection.add("Nigar");
//        collection.add("Ali");
//        collection.add("Ali");
//        collection.add("Ali");
//        collection.add("Vusal");
//        Iterator<String> iterator = collection.iterator();
//        iterator.next();
//        iterator.remove();
//        iterator.next();
//        iterator.remove();
//        System.out.println(collection);
//
//        Main<String> tTest = new Main<>();
//        tTest.test();

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"X");
        map.put(2,"a");
        map.put(3,"N");
        Set<Integer> keySet = map.keySet();
        System.out.println(keySet);
        System.out.println(map);
        map.forEach((k,v)-> System.out.println(v));

        List<Integer> list = Arrays.asList(1,2,3);

        list.forEach(System.out::println);










    }
}
