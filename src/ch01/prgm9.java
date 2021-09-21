package ch01;

import java.util.Scanner;

public class prgm9 {
    public static boolean StringComparison(String string,String string1){
        if (string.length()!=string1.length())
            return false;
        char[]ch={'s'};
        char[]ch1={'s'};
        for (int i=0;i<string.length();i++) {
            string.getChars(i,i+1,ch,0);
            string1.getChars(i,i+1,ch1,0);
            if (ch[0]!=ch1[0])
                return false;
        }
        return true;
    }

    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        System.out.print(" string: ");
        String str=in.nextLine();
        System.out.println();
        System.out.print(" string1: ");
        String str1=in.nextLine();
        System.out.print("StringComparison(string1,string2):  ");
        System.out.println(StringComparison(str,str1));
    }
}
