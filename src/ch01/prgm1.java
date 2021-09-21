package ch01;

import java.util.Scanner;

public class prgm1 {
public static void PrintNumberInBinaryOctalHexadecimalAndMore(int x){
    System.out.print("это число в системе исчисления с основанием 2: ");
    System.out.println(Integer.toString(x, 2));
    System.out.print("это число в системе исчисления с основанием 8: ");
    System.out.println(Integer.toString(x, 8));
    System.out.print("это число в системе исчисления с основанием 16: ");
    System.out.println(Integer.toString(x, 16));
    System.out.print("обратное число в системе исчисления с основанием 16: ");
    System.out.println(   Float.toHexString(1/(float)x));

}
    public static void main(String[] args) {
        int x;
        Scanner in = new Scanner(System.in);
        //int to str
        System.out.print(" число : ");
        x = in.nextInt();
        System.out.println();
        PrintNumberInBinaryOctalHexadecimalAndMore(x);
    }
}
