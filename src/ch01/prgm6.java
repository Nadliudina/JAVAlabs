package ch01;

import java.math.BigInteger;

public class prgm6 {

    public static BigInteger BigIntegerFactorial(BigInteger x){
        if (x.equals(0))
            return BigInteger.valueOf(1);

        BigInteger Result=BigInteger.valueOf(1);
        while (x.equals(BigInteger.valueOf(0))==false){
            Result=Result.multiply(x);
            x=x.add(BigInteger.valueOf(-1));
        }
        return Result;
    }
    public static void main(String []args){
        System.out.print("Factorial(1000) = ");
        System.out.println(BigIntegerFactorial(new BigInteger("1000")));
    }
}
