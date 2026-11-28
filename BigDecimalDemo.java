import java.math.*;

public class BigDecimalDemo
{
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("10.25"), b = new BigDecimal("3");
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        System.out.println(a.divide(b, 4, RoundingMode.HALF_UP));
    }
}
