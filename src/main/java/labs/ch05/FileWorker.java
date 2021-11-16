package labs.ch05;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;


public class FileWorker {

    private static java.util.logging.Logger jdkLogger=java.util.logging.Logger.getLogger("FileWorkerLogger");
    private static FileHandler handler;
    static {
        try {
            handler = new FileHandler("C:\\java\\log\\FileWorker.log");
            jdkLogger.addHandler(handler);
         //   jdkLogger.setUseParentHandlers(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * __1__
     * читает значения из файла в ArrayList<Double>
     * @param filename
     * @return ArrayList<Double>
     * @throws NumberFormatException
     * @throws FileNotFoundException
     */
    public static ArrayList<Double> readValues(String filename) throws NumberFormatException, FileNotFoundException {
        try (BufferedReader breader = new BufferedReader(new FileReader(filename));) {
            String str;
            ArrayList<Double> list = new ArrayList<Double>();
            while ((str = breader.readLine()) != null) {
                if (!str.isEmpty())
                    list.add(Double.parseDouble(str));
            }
            return list;
        } catch (IOException exception) {
            jdkLogger.log(Level.WARNING,"",exception);
            throw new FileNotFoundException(filename);
        } catch (NumberFormatException exception) {
            jdkLogger.log(Level.WARNING,"",exception);
            throw exception;
        }
    }

    /**
     *__2__
     * @param filename
     * @return double сумма значений из файла
     * @throws NumberFormatException
     * @throws FileNotFoundException
     */
    public static double sumOfValues(String filename) throws NumberFormatException, FileNotFoundException {
        double val = 0;
        try {
            for (double elem : readValues(filename))
                val += elem;
        } catch (NumberFormatException exception) {
            jdkLogger.log(Level.WARNING,"",exception);
            throw exception;
        } catch (FileNotFoundException exception) {
            jdkLogger.log(Level.WARNING,"",exception);
            throw exception;
        }
        return val;
    }

    /**__3__
     * значения из inFileName в outFileName в нижний регистр
     * @param inFileName
     * @param outFileName
     * @throws FileNotFoundException
     */
    public static void toLowerFile(String inFileName, String outFileName) throws FileNotFoundException {
        Scanner in = null;
        PrintWriter out = null;
        try {
            in = new Scanner(inFileName);
            out = new PrintWriter(outFileName);
            while (in.hasNext())
                out.println(in.next().toLowerCase());
        } catch (IOException e) {
            jdkLogger.log(Level.WARNING,"",e );
            throw e;
        } finally {
            if (in != null)
                in.close();
            if (out != null)
                out.close();
        }
    }

}
