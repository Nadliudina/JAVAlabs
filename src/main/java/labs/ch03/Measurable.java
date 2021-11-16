package labs.ch03;

/**
 * interface Measurable :
 * average среднее арифметическое
 * largest имя "наибольшего" объекта
 * GetName
 */
public interface Measurable {
    double getMeasure();

    /**
     * среднее арифметическое
     * @param objects
     * @return
     */
    static double average(Measurable[] objects) {
        double sum = 0;
        int count = 0;
        for (Measurable o : objects) {
            sum += o.getMeasure();
            count++;
        }
        return (count == 0 ? 0 : sum / count);
    }

    /**
     *
     * @param objects
     * @return имя "наибольшего" объекта
     */
    static String largest(Measurable[] objects) {
        double value = objects[0].getMeasure();
        Measurable max = objects[0];
        for (Measurable o : objects) {
            if (o.getMeasure() > value)
                max = o;
        }
        return max.GetName();
    }

    String GetName();


}
