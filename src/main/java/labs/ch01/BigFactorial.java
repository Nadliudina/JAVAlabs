package labs.ch01;

import java.math.BigInteger;

/**
 * класс BigFactorial
 *
 */
public class BigFactorial {
    /**
     * вычисляющим значение факториала числа типа BigInteger
     * @param x
     * @return факториал
     */
    public static BigInteger BigIntegerFactorial(BigInteger x) {
        if (x.equals(0))
            return BigInteger.valueOf(1);

        BigInteger Result = BigInteger.valueOf(1);
        while (!x.equals(BigInteger.valueOf(0))) {
            Result = Result.multiply(x);
            x = x.add(BigInteger.valueOf(-1));
        }
        return Result;
    }
}
