package Home.CollectionsHW;

import java.util.LinkedList;
import java.util.List;

public class ColHW {

    //  Создать обобщенный boolean метод который принимает в параметры коллекцию
    //      обобщенного типа , и переменную обобщенного типа.
    //  Если переменная содержится в коллекции возвращать true, иначе false.


    public static <T> boolean meth(LinkedList<T> list, T elem){

        for (T a : list) {
            if (a == elem) return true;
        }

        return false;
    }


}
