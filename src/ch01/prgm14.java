package ch01;

import java.util.Scanner;

public class prgm14 {
    public static boolean IsMagicSquare(){
        int I;
        Scanner in=new Scanner(System.in);
        System.out.print("Введите сторону квадрата: ");
        I=in.nextInt();
        System.out.println("Вводите по одному элементы: ");
        int [][] sq = new int[I][];

        for (int i=0;i<I;i++){
            sq [i]=new int[I];
            for (int j=0;j<I;j++){
                System.out.print(i);         System.out.print("|"); System.out.print(j);     System.out.print(" : ");
                sq[i][j]=in.nextInt();
                System.out.println();
            }
        }
        int s=0,s1,s2,s3,s4;
        for (int i=0;i<I;i++){
            s+=sq[0][i];
        }
        for (int i=0;i<I;i++){
            s1=0;s2=0;s3=0;s4=0;
            for (int j=0;j<I;j++){
                s1+=sq[i][j];
                s2+=sq[j][i];
                s3+=sq[j][j];
                s4+=sq[j][-j-1+I];
            }
            if (s1!=s||s2!=s||s3!=s||s4!=s){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
       System.out.println( IsMagicSquare());
    }
}
