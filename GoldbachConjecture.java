public class GoldbachConjecture
{
    public static void main(String[] args) {
        for (int n = 4; n <= 30; n += 2) {
            for (int p = 2; p <= n / 2; p++) {
                if (isPrime(p) && isPrime(n - p)) {
                    System.out.println(n + " = " + p + " + " + (n - p));
                    break;
                }
            }
        }
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) if (n % i == 0) return false;
        return true;
    }
}
