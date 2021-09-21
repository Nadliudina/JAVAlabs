package ch01;

import java.util.Random;

public class prgm10 {
    public static void PrintRandomString(){
        Random rand=new Random();
        long L=rand.nextLong();
        System.out.println(Long.toString(L,36));
    }
    public static void main(String[] args){
        PrintRandomString();
    }
}
