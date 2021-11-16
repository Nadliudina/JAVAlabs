package labs.ch06;

import java.util.ArrayList;
import java.util.function.Function;

/**
 * 15
 */
public class Map {
    public static <T, V> ArrayList<V> map(ArrayList<T> tArrayList, Function<T, V> func) {
        ArrayList<V> vArrayList = new ArrayList<>();
        for (T elem : tArrayList)
            vArrayList.add(func.apply(elem));
        return vArrayList;
    }
}
