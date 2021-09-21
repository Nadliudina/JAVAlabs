package ch01;

import java.util.ArrayList;
import java.util.Random;

public class prgm13 {

    public static void Casino(){
        Random r=new Random();
        int winner;
        ArrayList<Integer> Players=new ArrayList<Integer>();
        for (int i=1;i<=50;i++)
            Players.add(i);
        for (int i=0;i<6;i++){
            winner= r.nextInt(50-i);
            System.out.println(Players.get(winner));
            Players.remove(winner);
        }
    }
    public static void main(String[] args){
        Casino();
    }
}
