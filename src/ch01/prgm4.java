package ch01;

public class prgm4 {
public static void PrintSmallestAndLargestPositiveDouble(){
    System.out.print(" Double.MAX_VALUE: ");
    System.out.println(Double.MAX_VALUE);
    System.out.print(" Math.nextDown(Double.POSITIVE_INFINITY): ");
    System.out.println(Math.nextDown(Double.POSITIVE_INFINITY));
    System.out.print(" Double.MIN_VALUE: ");
    System.out.println(Double.MIN_VALUE);
    System.out.print(" Math.nextUp(0.0d): ");
    System.out.println(Math.nextUp(0.0d));

}
    public static void main(String[] args){
        PrintSmallestAndLargestPositiveDouble();
    }
}
