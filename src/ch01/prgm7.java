package ch01;

import java.util.Scanner;

public class prgm7 {
    public static void PrintSum(int x,int y){
        System.out.print(x);
        System.out.print("+");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(x+y);
    }
    public static void PrintDifference(int x,int y){
        System.out.print(x);
        System.out.print("-");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(x-y);
    }
    public static void PrintProduct(int x,int y){
        System.out.print(x);
        System.out.print("*");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(x*y);
    }
    public static void PrintQuotient(int x,int y){
        System.out.print(x);
        System.out.print("/");
        System.out.print(y);
        System.out.print(" = ");
        int Integer=0;
        int Tail=0;
        Tail=Remainder(x,y);
        while(x>=y) {
            x -= y;
            Integer++;
        }
        System.out.print(Integer);
        System.out.print(" ");
        System.out.print(Tail);
        System.out.print("/");
        System.out.println(y);
    }
    public static int Remainder(int x,int y){
        while(x>=y)
         x-=y;
        return x;
    }
    public static void PrintRemainder(int x,int y){
        System.out.print(x);
        while(x>=y)
            x-=y;
        System.out.print("%");
        System.out.print(y);
        System.out.print(" = ");
        System.out.println(x);
    }
    public static void main(String []args){
        int x,y;
        Scanner in=new Scanner(System.in);
        System.out.print(Integer.MAX_VALUE);
        System.out.print(" number1: ");
        x=in.nextInt();
        System.out.println();
        System.out.print(" number2: ");
        y=in.nextInt();
        System.out.println();
        PrintQuotient(x,y);
        PrintSum(x,y);
        PrintRemainder(x,y);
        PrintDifference(x,y);
        PrintProduct(x,y);

    }
}
