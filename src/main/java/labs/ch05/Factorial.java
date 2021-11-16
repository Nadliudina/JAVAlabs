package labs.ch05;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;


public class Factorial {

    private static java.util.logging.Logger jdkLogger=java.util.logging.Logger.getLogger("FactorialLogger");
    private static FileHandler handler;
    static {
        try {
            handler = new FileHandler("C:\\java\\log\\Factorial.log");
            jdkLogger.addHandler(handler);
            //   jdkLogger.setUseParentHandlers(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * __11__
     * вычисляет факториал и показывает стек вызовов
     * @param val
     * @return
     * @throws IllegalAccessException
     */
    public static int factorial(int val) throws IllegalAccessException {
        if (val<0)
        {
            IllegalAccessException e = new IllegalAccessException("val<0");
            jdkLogger.log(Level.WARNING,"",e);
            throw e;
        }
        if (val==0){
            Exception exception=new Exception("trace");
            exception.printStackTrace();
            return 1;
        }
        return val*factorial(val-1);
    }
}
