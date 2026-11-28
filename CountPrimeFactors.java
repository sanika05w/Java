public class CountPrimeFactors
{
    public static void main(String[] args) {
        int n = 360, count = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                count++;
                while (n % i == 0) n /= i;
            }
        }
        System.out.println("Distinct prime factors = " + count);
    }
}
