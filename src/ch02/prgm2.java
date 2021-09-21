package ch02;

import java.util.Random;
import java.util.Scanner;

public class prgm2 {

    public static void main(String[] args) {


    }

    public static void Scan () {
        int number;
        Scanner in=new Scanner(System.in);
        System.out.print(" number: ");
        number=in.nextInt();
        System.out.println();
    }
    public static void Rand () {
        int number;
        Random rand=new Random();
        System.out.print(" number: ");
       number=rand.nextInt();
        System.out.println(number);
    }

}
