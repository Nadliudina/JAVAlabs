package labs.ch06;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.FileHandler;
import java.util.logging.Level;

/**
 * 14
 */
public class CloseAll {

    private static java.util.logging.Logger jdkLogger=java.util.logging.Logger.getLogger("CloseAllLogger");
    private static FileHandler handler;
    static {
        try {
            handler = new FileHandler("C:\\java\\log\\CloseAll.log");
            jdkLogger.addHandler(handler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static <T extends AutoCloseable> void closeAll(ArrayList<T> elems) throws Exception {
        Exception chainExc = null;
        for (T elem : elems)
            try {
                elem.close();
            } catch (Exception e) {
                chainExc = new Exception(e.getMessage(),chainExc);
            }
        if (chainExc == null)
            return;
        jdkLogger.log(Level.WARNING,"",chainExc);
        throw chainExc;
    }
}
