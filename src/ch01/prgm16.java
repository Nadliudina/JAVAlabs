package ch01;

public class prgm16 {
    public static float Average(int first, int... rest) {
        int sum = first;
        for (int value : rest) {
            sum += value;
        }
        return (float) sum / (rest.length + 1);
    }
    public static void main(String[] args){
    System.out.println(Average(3,78,6));
    }
}
