import java.math.*;

public class FactorialDigitsSum
{
    public static void main(String[] args) {
        BigInteger f = BigInteger.ONE;
        for (int i = 2; i <= 50; i++) f = f.multiply(BigInteger.valueOf(i));
        int sum = 0;
        for (char c : f.toString().toCharArray()) sum += c - '0';
        System.out.println("Digit sum of 50! = " + sum);
    }
}
