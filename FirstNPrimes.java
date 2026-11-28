public class FirstNPrimes
{
    public static void main(String[] args) {
        int count = 0, num = 2;
        while (count < 15) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }

    static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return n > 1;
    }
}
