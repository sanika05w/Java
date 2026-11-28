public class EulerTotient
{
    public static void main(String[] args) {
        int n = 36, count = 0;
        for (int i = 1; i <= n; i++) if (gcd(i, n) == 1) count++;
        System.out.println("phi(" + n + ") = " + count);
    }

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
