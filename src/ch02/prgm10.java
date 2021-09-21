package ch02;

import java.util.Random;

public class prgm10 {
    static int RandomValFromMassive(int []x){
        Random r=new Random();
        return x[r.nextInt(x.length)];
    }
    public static void main(String[] args){
        int [] a=new int[]{1, 2, 3, 4, 5};
        System.out.println(RandomValFromMassive(a));
    }
}
