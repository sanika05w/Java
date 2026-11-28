import java.math.*;

public class BigIntegerFactorial
{
    public static void main(String[] args) {
        BigInteger f = BigInteger.ONE;
        for (int i = 2; i <= 30; i++) f = f.multiply(BigInteger.valueOf(i));
        System.out.println("30! = " + f);
    }
}
