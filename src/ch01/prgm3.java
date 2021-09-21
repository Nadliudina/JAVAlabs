package ch01;

import java.util.Scanner;

public class prgm3 {
    public static int Max3Conditions (int x,int y ,int z){
        int m;
        if (x>y){
            m=x;
        }else {
            m=y;
        }
        if (z>m){
            m=z;
        }
        return m;
    }
    public static int Max3Math (int x,int y ,int z){
        int m;
        m=Math.max(x,y);
        m=Math.max(m,z);
        return m;
    }

    public static void main(String[] args){
        int x,y,z,m;
        Scanner in=new Scanner(System.in);
        System.out.print(" number1: ");
        x=in.nextInt();
        System.out.println();
        System.out.print(" number2: ");
        y=in.nextInt();
        System.out.println();
        System.out.print(" number3: ");
        z=in.nextInt();
        System.out.println();

        System.out.print(" max3Conditions out: ");
        System.out.println(Max3Conditions(x,y,z));

        System.out.print(" max3Math out: ");
        System.out.println(Max3Math(x,y,z));
    }
}
