package ch02;

import java.nio.charset.Charset;


public class prgm11 {
    public static void NotAsciiFinder(String string){

        char[]ch={'s'};
        for (int i=0;i<string.length();i++)
        {
            string.getChars(i,i+1,ch,0);
            if (Charset.forName("US-ASCII").newEncoder().canEncode(ch[0])==false) {
                System.out.print(ch);
                System.out.print("  ");
                System.out.println( "\\u" + Integer.toHexString(ch[0] | 0x10000).substring(1) );

            }
        }
    }
    public static void main(String[] args){
        NotAsciiFinder(" as asd string ыфв фыв ркер енро ");


    }
}
