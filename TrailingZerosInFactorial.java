public class TrailingZerosInFactorial
{
    public static void main(String[] args) {
        int n = 100, zeros = 0;
        for (int i = 5; n / i > 0; i *= 5) zeros += n / i;
        System.out.println(n + "! has " + zeros + " trailing zeros");
    }
}
