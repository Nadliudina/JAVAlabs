package ch01;

import java.util.ArrayList;

public class prgm15 {
    public static void PrintPascalTriangle( int N){
        ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>();
        for (int i=0;i<N;i++){
            a.add(new ArrayList<Integer>());
            for (int j=0;j<i+1;j++){
                if (j==0||j==i)
                {
                    (a.get(i)).add(1);
                }
                else{
                    a.get(i).add(a.get(i-1).get(j-1)+a.get(i-1).get(j));
                }
                System.out.print(a.get(i).get(j));
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        PrintPascalTriangle(6);
    }
}
