public class BinomialCoefficient
{
    public static void main(String[] args) {
        int n = 10, k = 3;
        long c = 1;
        for (int i = 1; i <= k; i++) c = c * (n - k + i) / i;
        System.out.println("C(" + n + "," + k + ") = " + c);
    }
}
