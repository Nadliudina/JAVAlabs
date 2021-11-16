package labs.ch03;

import java.io.File;
import java.util.Arrays;

/**
 * class FileSort
 * Sort(File[] files) сортирует массив файлов и директорий
 *
 */

public class FileSort {
    public static void Sort(File[] files) {
        //   Arrays.sort(files);
        Arrays.sort(files, (x, y) -> {
            if (x.isDirectory())
                if (y.isDirectory())
                    return x.compareTo(y);
                else
                    return -1;
            else if (y.isDirectory())
                return 1;
            else return x.compareTo(y);
        });
    }
}
