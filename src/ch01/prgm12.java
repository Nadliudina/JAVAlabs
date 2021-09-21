package ch01;

import java.util.ArrayList;
import java.util.Random;


public class prgm12 {
    public static void CycleWithBreak(){
        for (int i =0;i<10;i++){
            System.out.println(i);
            if(i==5)
                i+=10;
        }
    }
    public static void CycleWithContinue(){
        for (int i =0;i<10;i++){
            System.out.println(i);
            if(i==5)
                i+=1;
        }
    }
    public static void main(String[] args){
        CycleWithContinue();
        System.out.println();
        CycleWithBreak();
    }
}
