package labs.ch05;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;

/**
 *
 */
public class Log {

    public static void testLog(){
    Logger logger = LoggerFactory.getLogger(Log.class);
        logger.debug("hello world!");
    }
    public static void testLogJDK(){
        java.util.logging.Logger jdkLogger=java.util.logging.Logger.getLogger("testJDKlogger");
        FileHandler handler= null;
        try {
            handler = new FileHandler("C:\\java\\log\\log.log");
            jdkLogger.addHandler(handler);
        } catch (IOException e) {
            jdkLogger.warning("HANDLER FOR LOG IS NULL");
        }
        jdkLogger.info("this info is useless");
        try  {
            throw new Exception("for log");
        } catch (Exception exception) {
            jdkLogger.log(Level.WARNING,"xexe",exception);

        }

    }
}
