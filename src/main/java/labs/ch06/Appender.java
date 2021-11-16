package labs.ch06;

import java.util.ArrayList;

/**
 * __6__
 */
public class Appender {
    public static <T> void appender(ArrayList<? extends T> arrayFrom,ArrayList<T> arrayTo){
        for (T elem: arrayFrom)
            arrayTo.add(elem);
    }
    public static <T> void appender1(ArrayList<T> arrayFrom,ArrayList<? super T> arrayTo){
        for (T elem: arrayFrom)
            arrayTo.add(elem);
    }
}
