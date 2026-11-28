public class PalindromicPrimes
{
    public static void main(String[] args) {
        for (int i = 2; i < 200; i++) {
            String s = String.valueOf(i);
            if (isPrime(i) && s.equals(new StringBuilder(s).reverse().toString())) System.out.print(i + " ");
        }
        System.out.println();
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) if (n % i == 0) return false;
        return true;
    }
}
