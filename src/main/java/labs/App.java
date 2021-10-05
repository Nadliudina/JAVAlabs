package labs;

import labs.ch01.MagicSquare;
import labs.ch02.Calendar;
import labs.ch02.Car;
import labs.ch02.Point;
import labs.ch03.Employee;
import labs.ch03.Measurable;
import labs.ch03.Runner;
import labs.ch04.LabeledPoint;

import java.io.File;
import java.lang.reflect.*;
import java.math.BigInteger;
import java.time.DayOfWeek;
import java.util.Arrays;

import static labs.ch01.BigFactorial.*;
import static labs.ch01.IntArithmetic.*;
import static labs.ch03.FileSort.Sort;

public class App {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        System.out.println("Main ");
        System.out.print("Factorial(1000) = ");
        System.out.println(BigIntegerFactorial(new BigInteger("1000")));
///////////////////////
        int x, y;
        x = 1000;
        y = 2147483647;
        System.out.print(Integer.MAX_VALUE);

        System.out.println();
        PrintQuotient(x, y);
        PrintSum(x, y);
        PrintRemainder(x, y);
        PrintDifference(x, y);
        PrintProduct(x, y);
        ///////////////////////
        MagicSquare ms = new MagicSquare();
        System.out.println(" MAGIC: " + ms.InputSquare(new int[][]{
                {2, 7, 6},
                {9, 5, 1},
                {4, 3, 8}}));
        ////////////////////////////CH02
        Point p = new Point(3, 4);
        System.out.println(p);
        p.ScalePoint(2, 3);
        System.out.println(p);
        System.out.println(p.GetPointWithShift(5, 5));
        ////////////////////
        Car car = new Car(0, 50, 2);
        System.out.println(car);
        car.AddFuel(-55);
        System.out.println(car);
        car.AddFuel(-5);
        System.out.println(car);
        car.Drive(5);
        System.out.println(car);
        car.Drive(-5);
        System.out.println(car);
        car.Drive(55);
        System.out.println(car);
        car.Drive(-55);
        System.out.println(car);
        //////////////////////////////
        Calendar cal = new Calendar(2021, 9, 1);
        System.out.println(cal);
        cal.SetStartWeekday(DayOfWeek.SUNDAY);
        System.out.println(cal);
        /////////////////////////
        Employee[] emp = new Employee[5];
        for (int i = 0; i < 5; i++)
            emp[i] = new Employee(i, "man # " + i);
        System.out.println(Measurable.average(emp));
        System.out.println(Measurable.largest(emp));
        ////////////
        Runnable[] r = {
                () -> System.out.println(2),
                () -> System.out.println(3),
                () -> {
                    for (int i = 0; i < 5; i++)
                        System.out.print((char) i);
                }};
        Runner.Execute(r);
        /////////////
        File[] files = new File("C:\\java").listFiles();
        System.out.println(Arrays.toString(files));
        Sort(files);
        System.out.println(Arrays.toString(files));
        //////////////////////////////////

        Point p1 = new Point(2, 3);
        Point p2 = new Point(2, 3);
        Point p3 = new Point(2, 4);
        System.out.println(p1 + "\n" + p2 + "\n" + p3);
        System.out.println(p1.equals(p1) + "\n" + p1.equals(p2) + "\n" + p1.equals(p3));
        System.out.println(p1.hashCode() + "\n" + p2.hashCode() + "\n" + p3.hashCode() + "\n");

        LabeledPoint lp1 = new LabeledPoint(2, 3, "xex");
        LabeledPoint lp2 = new LabeledPoint(2, 3, "xax");
        LabeledPoint lp3 = new LabeledPoint(2, 4, "xex");
        LabeledPoint lp4 = new LabeledPoint(2, 3, "xex");
        System.out.println(lp1 + "\n" + lp2 + "\n" + lp3 + "\n" + lp4);
        System.out.println(lp1.equals(lp1) + "\n" + lp1.equals(lp2) + "\n" + lp1.equals(lp3) + "\n" + lp1.equals(lp4));
        System.out.println(lp1.hashCode() + "\n" + lp2.hashCode() + "\n" + lp3.hashCode() + "\n" + lp4.hashCode() + "\n");

        //    Class<?> systemClass = java.lang.Class.forName("java.lang.System");
        //  String xxx="java.lang.String";
        //  Method method=systemClass.getDeclaredMethod("println", Class.forName(xxx));
        // method.invoke( obj,"sada");
    }
}
