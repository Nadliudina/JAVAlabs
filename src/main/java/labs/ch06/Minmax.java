package labs.ch06;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Level;

public class Minmax {

    private static java.util.logging.Logger jdkLogger=java.util.logging.Logger.getLogger("MinmaxLogger");
    private static FileHandler handler;
    static {
        try {
            handler = new FileHandler("C:\\java\\log\\Minmax.log");
            jdkLogger.addHandler(handler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * __12__
     * @param elements
     * @param comp
     * @param result
     * @param <T>
     */
    public static <T> void minmax(List<T> elements, Comparator<? super T> comp, List<? super T> result) {
        if (elements.isEmpty())
        {
            Exception e =new IllegalArgumentException("list is empty");
            jdkLogger.log(Level.WARNING,"",e);
        }
        T max = elements.get(0);
        T min = elements.get(0);
        for (T element : elements) {
            if (comp.compare(max,element)<0)
                max=element;
            if (comp.compare(min,element)>0)
                min=element;
        }
        result.add(min);
        result.add(max);

    }

    /**
     * 13
     * @param elements
     * @param comp
     * @param result
     * @param <T>
     */
    public static <T> void maxmin(List<T> elements, Comparator<? super T> comp, List<? super T> result){
        minmax(elements,comp,result);
        swapHelper(result,0,1);
    }

    public static<T> void swapHelper(List<T> list, int i, int j){
        T temp=list.get(i);
        list.set(i, list.get(j));
        list.set(j,temp);
    }

}
