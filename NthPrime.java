public class NthPrime
{
    public static void main(String[] args) {
        int n = 10, count = 0, num = 1;
        while (count < n) {
            num++;
            if (isPrime(num)) count++;
        }
        System.out.println("The " + n + "th prime is " + num);
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) if (n % i == 0) return false;
        return true;
    }
}
