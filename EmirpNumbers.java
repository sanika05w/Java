public class EmirpNumbers
{
    public static void main(String[] args) {
        for (int i = 11; i < 100; i++) {
            int rev = Integer.parseInt(new StringBuilder(String.valueOf(i)).reverse().toString());
            if (rev != i && isPrime(i) && isPrime(rev)) System.out.print(i + " ");
        }
        System.out.println();
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) if (n % i == 0) return false;
        return true;
    }
}
