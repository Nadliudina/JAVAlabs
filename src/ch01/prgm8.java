package ch01;

import java.util.Scanner;

public class prgm8 {
    public static void Parser(){
        Scanner in=new Scanner(System.in);
        System.out.print("Строка: ");
        String str=in.nextLine();
        System.out.println();
        System.out.print("Подстроки: ");
        String []res=str.split(" ");
        for (int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
    public static void main(String []args){
    Parser();
    }
}
