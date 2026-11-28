public class TwinPrimes
{
    public static void main(String[] args) {
        for (int p = 3; p <= 100; p++) {
            if (isPrime(p) && isPrime(p + 2)) System.out.println("(" + p + ", " + (p + 2) + ")");
        }
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) if (n % i == 0) return false;
        return true;
    }
}
