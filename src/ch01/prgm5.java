package ch01;

public class prgm5 {
    public static int CastADoubleToAInt(double Double){
        return (int)Double;
    }
    public static void main(String[] args){
        double myDouble=Double.MAX_VALUE;
        int I=CastADoubleToAInt(myDouble);
        System.out.print("I: ");
        System.out.println(I);
        System.out.print("myDouble: ");
        System.out.println(myDouble);
    }
}
