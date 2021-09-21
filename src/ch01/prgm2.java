package ch01;

import java.util.Scanner;

public class prgm2 {

    public static void main(String[] args) {
        int number;
        Scanner in=new Scanner(System.in);
        System.out.print(" number: ");
        number=in.nextInt();
        System.out.println();
        System.out.print("   normalize360 out: ");
        System.out.println(Normalize360(number));
        System.out.print("   normalize360floorMod out: ");
        System.out.println(Normalize360floorMod(number));
    }

    public static int Normalize360 (int integer) {
        integer %= 360;
        return java.lang.Math.abs(integer);
    }

    public static int Normalize360floorMod (int integer) {
        integer = Math.floorMod(java.lang.Math.abs(integer), 360);
        return integer;
    }
}
