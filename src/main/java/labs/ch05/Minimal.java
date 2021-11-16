package labs.ch05;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;

import static java.util.logging.Level.WARNING;

/**
 *
 */
public class Minimal {

    private static java.util.logging.Logger jdkLogger=java.util.logging.Logger.getLogger("MinimalLogger");
    private static FileHandler handler;
    static {
        try {
            handler = new FileHandler("C:\\java\\log\\Minimal.log");
            jdkLogger.addHandler(handler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     *__13__
     * @param values
     * @return минимальное значение
     */

    public static int min(int[] values) {

        if (values.length == 0){
            Exception e=new IllegalArgumentException("len==0");
            jdkLogger.log(Level.WARNING,"len==0",e);
        }

        int min=values[0];
        for (int item:values )
            if (min>item)
                min=item;

        assert isMin(min,values) :"no min" ;
        return min;
    }

    /**
     *
     * @param val
     * @param values
     * @return val минимальное ?
     */
    private static boolean isMin(int val, int[] values) {
        for (int item : values)
            if (item < val)
                return false;

        return true;
    }
}
