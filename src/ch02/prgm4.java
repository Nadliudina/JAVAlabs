package ch02;

 class IntHolder{
    public int x;
    public IntHolder(int x){
        this.x=x;
    }

    static void swap(IntHolder a,IntHolder b){
        int c=a.x;
        a.x=b.x;
        b.x=c;
    }
}

public class prgm4 {

    public static void main(String[] args){
        IntHolder a = new IntHolder(3);
        IntHolder b = new IntHolder(5);
        IntHolder.swap(a,b);
        System.out.println("a: "+a.x);
        System.out.println("b: "+b.x);
    }
}
