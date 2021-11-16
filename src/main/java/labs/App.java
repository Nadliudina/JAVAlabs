package labs;

import labs.ch01.MagicSquare;
import labs.ch02.Calendar;
import labs.ch02.Car;
import labs.ch02.Point;
import labs.ch03.Employee;
import labs.ch03.Measurable;
import labs.ch03.Runner;
import labs.ch04.*;
import labs.ch05.Factorial;
import labs.ch05.FileWorker;
import labs.ch05.Log;
import labs.ch05.Minimal;
import labs.ch06.*;
import labs.ch06.Map;
import labs.ch06.Stack;
import org.apache.log4j.PropertyConfigurator;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.*;
import java.math.BigInteger;
import java.time.DayOfWeek;
import java.util.*;
import java.util.function.Predicate;

import static labs.ch01.BigFactorial.*;
import static labs.ch01.IntArithmetic.*;
import static labs.ch03.FileSort.Sort;


public class App {

    public static void test_Ch01_BigFactorial() {
        System.out.print("Factorial(1000) = ");
        System.out.println(BigIntegerFactorial(new BigInteger("1000")));
    }

    public static void test_Ch01_IntArithmetic() {
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
    }

    public static void test_Ch01_MagicSquare() {
        MagicSquare ms = new MagicSquare();
        System.out.println(" MAGIC: " + ms.InputSquare(new int[][]{
                {2, 7, 6},
                {9, 5, 1},
                {4, 3, 8}}));
    }

    public static void test_Ch02_Calendar() {
        Calendar cal = new Calendar(2021, 9, 1);
        System.out.println(cal);
        cal.SetStartWeekday(DayOfWeek.SUNDAY);
        System.out.println(cal);
    }

    public static void test_Ch02_Car() {
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
    }

    public static void test_Ch02_Point() {
        Point p = new Point(3, 4);
        System.out.println(p);
        p.ScalePoint(2, 3);
        System.out.println(p);
        System.out.println(p.GetPointWithShift(5, 5));
    }

    public static void test_Ch03_Employee() {
        Employee[] emp = new Employee[5];
        for (int i = 0; i < 5; i++)
            emp[i] = new Employee(i, "man # " + i);
        System.out.println(Measurable.average(emp));
        System.out.println(Measurable.largest(emp));
    }

    public static void test_Ch03_FileSort() {
        File[] files = new File("C:\\java").listFiles();
        System.out.println(Arrays.toString(files));
        Sort(files);
        System.out.println(Arrays.toString(files));
    }

    public static void test_Ch03_Runner() {
        Runnable[] r = {
                () -> System.out.println(2),
                () -> System.out.println(3),
                () -> {
                    for (int i = 0; i < 5; i++)
                        System.out.print((char) i);
                }};
        Runner.Execute(r);
    }

    public static void test_Ch04_Point() {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(2, 3);
        Point p3 = new Point(2, 4);
        System.out.println(p1 + "\n" + p2 + "\n" + p3);
        System.out.println(p1.equals(p1) + "\n" + p1.equals(p2) + "\n" + p1.equals(p3));
        System.out.println(p1.hashCode() + "\n" + p2.hashCode() + "\n" + p3.hashCode() + "\n");

    }

    public static void test_Ch04_Circle() {
        Circle circle = new Circle(new Point(3, 4), 2);
        System.out.println(circle);
        Circle ccircle = (Circle) circle.clone();
        System.out.println("clone : " + ccircle);
        circle.moveBy(1, -1);
        System.out.println(circle);
        if (ccircle != null)
            System.out.println("clone : " + ccircle);
        System.out.println();
    }

    public static void test_Ch04_LabeledPoint() {
        LabeledPoint lp1 = new LabeledPoint(2, 3, "xex");
        LabeledPoint lp2 = new LabeledPoint(2, 3, "xax");
        LabeledPoint lp3 = new LabeledPoint(2, 4, "xex");
        LabeledPoint lp4 = new LabeledPoint(2, 3, "xex");
        System.out.println(lp1 + "\n" + lp2 + "\n" + lp3 + "\n" + lp4);
        System.out.println(lp1.equals(lp1) + "\n" + lp1.equals(lp2) + "\n" + lp1.equals(lp3) + "\n" + lp1.equals(lp4));
        System.out.println(lp1.hashCode() + "\n" + lp2.hashCode() + "\n" + lp3.hashCode() + "\n" + lp4.hashCode() + "\n");
    }

    public static void test_Ch04_Line() {
        Line line = new Line(new Point(1, 1), new Point(10, 20));
        System.out.println(line);
        Line cline = null;
        cline = (Line) line.clone();
        System.out.println("clone : " + cline);
        line.moveBy(5, -5);
        System.out.println(line);
        if (cline != null)
            System.out.println("clone : " + cline);
        System.out.println();

        Line emptyLine = null;
        try {
            Line cline1 = (Line) emptyLine.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void test_Ch04_Rectangle() {
        Rectangle rectangle = new Rectangle(new Point(1, 2), 5, 6);
        System.out.println(rectangle);
        Rectangle crectangle = null;
        crectangle = (Rectangle) rectangle.clone();
        System.out.println("clone : " + crectangle);
        rectangle.moveBy(4, 8);
        System.out.println(rectangle);
        if (crectangle != null)
            System.out.println("clone : " + crectangle);
        System.out.println();
    }

    public static void test_Ch05_FileWorker() {

        String[] dirs = {"C:\\java\\digits.txt", "C:\\java\\digitsWithLetter.txt", "wrongDir"};
        for (int i = 0; i < dirs.length; i++)
            try {
                for (double elem : FileWorker.readValues(dirs[i])) {
                    System.out.println("elem = " + elem);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }

        for (int i = 0; i < dirs.length; i++)
            try {
                System.out.println(FileWorker.sumOfValues(dirs[i]));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
    }

    public static void test_Ch05_Minimal() {
        System.out.println(Minimal.min(new int[]{3, 4, 6, 4, 23, 4, 56, 7}));
    }

    public static void test_Ch05_ReentrantLocker() {

    }

    public static void test_Ch05_Factorial() {
        try {
            System.out.println(Factorial.factorial(5));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(Factorial.factorial(-5));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void test_Ch06_Stack() {
        Stack<String> stack = new Stack<>();
        String strings[] = {"first", "second", "third"};
        for (String item : strings) {
            stack.push(item);
        }
        while (!stack.isEmpty())
            System.out.println(stack.pop());
    }

    public static void test_Ch06_ArrayStack() {
        ArrayStack<String> stack = new ArrayStack<>();
        String strings[] = {"first", "second", "third"};
        for (String item : strings) {
            stack.push(item, String[]::new);
        }
        while (!stack.isEmpty())
            System.out.println(stack.pop());
    }

    public static void test_Ch06_ArrayObjStack() {
        ArrayObjStack<String> stack = new ArrayObjStack<>();
        String strings[] = {"first", "second", "third"};
        for (String item : strings) {
            stack.push(item);
        }
        while (!stack.isEmpty())
            System.out.println(stack.pop());
    }

    public static void test_Ch06_Table() {
        System.out.println();
        Table<Integer, String> table = new Table<>();
        String strings[] = {"first", "second", "third"};
        int id = 0;
        for (String item : strings) {
            table.put(id, item);
            id++;
        }


        for (int i = 0; i < 3; i++)
            System.out.println(i + " " + table.get(i));

        table.put(1, "SECOND");

        for (int i = 0; i < 3; i++)
            System.out.println(i + " " + table.get(i));


    }

    public static void test_Ch06_TableEntryNested() {
        System.out.println();
        TableEntryNested<Integer, String> table = new TableEntryNested<>();
        String strings[] = {"first", "second", "third"};
        int id = 0;
        for (String item : strings) {
            table.put(id, item);
            id++;
        }

        for (int i = 0; i < 3; i++)
            System.out.println(i + " " + table.get(i));

        table.put(1, "SECOND");

        for (int i = 0; i < 3; i++)
            System.out.println(i + " " + table.get(i));

    }

    public static void test_Ch06_Swap() {
        Double res[] = Swap.swap(0, 1, 3.0, 4.0);
        for (Double d : res)
            System.out.println(d);
    }

    public static void test_Ch06_Appender() {
        ArrayList<Shape> shapes = new ArrayList<>();
        ArrayList<Circle> circles = new ArrayList<>();
        circles.add(new Circle(new Point(3, 4), 10));
        circles.add(new Circle(new Point(4, 3), 5));
        Appender.appender(circles, shapes);
        Appender.appender1(circles, shapes);
        for (Shape s : shapes)
            System.out.println(s);
    }

    public static void test_Ch06_Minmax() {
        ArrayList<Circle> circles = new ArrayList<>();
        circles.add(new Circle(new Point(3, 4), 10));
        circles.add(new Circle(new Point(4, 3), 5));
        circles.add(new Circle(new Point(4, 3), 8));
        circles.add(new Circle(new Point(4, 3), 11));
        List<Circle> minmax = new ArrayList<>();
        Minmax.minmax(circles, new Comparator<Circle>() {
            @Override
            public int compare(Circle o1, Circle o2) {
                return (int) o1.radius - (int) o2.radius;
            }
        }, minmax);
        System.out.println("Min: " + minmax.get(0) + "\nmax: " + minmax.get(1));
        Minmax.maxmin(circles, new Comparator<Circle>() {
            @Override
            public int compare(Circle o1, Circle o2) {
                return (int) o1.radius - (int) o2.radius;
            }
        }, minmax);
        System.out.println("Max: " + minmax.get(0) + "\nMin: " + minmax.get(1));
    }

    public static void test_Ch06_CloseAll() {

    }

    public static void test_Ch06_Map() {
        System.out.println("Map:");
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            integerArrayList.add(i);
        ArrayList<Double> doubleArrayList=  Map.map(integerArrayList,(x)->(x*2.0));
        for (double elem : doubleArrayList)
            System.out.println(elem);
    }

    public static void test_Ch06_() {

    }

    public static void test_Ch0_() {

    }

    public static void main(String[] args) {
        System.out.println("Main ");

        test_Ch01_BigFactorial();
        test_Ch01_IntArithmetic();
        test_Ch01_MagicSquare();

        test_Ch02_Point();
        test_Ch02_Calendar();
        test_Ch02_Car();

        test_Ch03_Employee();
        test_Ch03_FileSort();
        test_Ch03_Runner();

        test_Ch04_Point();
        test_Ch04_Circle();
        test_Ch04_Line();
        test_Ch04_LabeledPoint();
        test_Ch04_Rectangle();

        test_Ch05_FileWorker();
        test_Ch05_Factorial();
        test_Ch05_Minimal();
        test_Ch05_ReentrantLocker();//!!!!!!!!

        test_Ch06_Stack();
        test_Ch06_ArrayStack();
        test_Ch06_ArrayObjStack();
        test_Ch06_Table();
        test_Ch06_TableEntryNested();
        test_Ch06_Swap();
        test_Ch06_Appender();
        test_Ch06_Minmax();
        test_Ch06_Map();

        System.out.println("\nOK");

    }

}
