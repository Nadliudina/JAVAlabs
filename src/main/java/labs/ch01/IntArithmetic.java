package labs.ch01;

/**
 * класс IntArithmetic с методами для двух int :
 * PrintDifference вычисляет разность
 * PrintProduct вычисляет произведение
 * PrintQuotient вычисляет частное
 * Remainder вычисляет остаток от деления
 * вычисляет
 *
 */
public class IntArithmetic {
    /**
     * cумма
     * @param x
     * @param y
     */
    public static void PrintSum(int x, int y) {
        System.out.print(x);
        System.out.print(" + ");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(Integer.toUnsignedString(x + y));
    }

    /**
     * разность
     * @param x
     * @param y
     */
    public static void PrintDifference(int x, int y) {
        System.out.print(x);
        System.out.print(" - ");
        System.out.print(y);
        System.out.print(" = ");
        if (x < y) System.out.print("-");
        System.out.println(Integer.toUnsignedString(x - y));
    }

    /**
     * произведение
     * @param x
     * @param y
     */
    public static void PrintProduct(int x, int y) {
        System.out.print(x);
        System.out.print(" * ");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(Integer.toUnsignedString(x * y));
    }

    /**
     * частное
     * @param x
     * @param y
     */
    public static void PrintQuotient(int x, int y) {
        System.out.print(x);
        System.out.print(" / ");
        System.out.print(y);
        System.out.print(" = ");
        int head = 0;
        int tail = 0;
        tail = Remainder(x, y);
        while (x >= y) {
            x -= y;
            head++;
        }
        System.out.print(Integer.toUnsignedString(head));
        System.out.print(" ");
        System.out.print(tail);
        System.out.print(" / ");
        System.out.println(y);
    }

    /**
     * остаток
     * @param x
     * @param y
     * @return
     */
    public static int Remainder(int x, int y) {
        while (x >= y)
            x -= y;
        return x;
    }

    /**
     * остаток
     * @param x
     * @param y
     */
    public static void PrintRemainder(int x, int y) {
        System.out.print(x);
        while (x >= y)
            x -= y;
        System.out.print(" % ");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(Integer.toUnsignedString(x));
    }
}
