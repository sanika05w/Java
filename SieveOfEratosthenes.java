public class SieveOfEratosthenes
{
    public static void main(String[] args) {
        int n = 50;
        boolean[] composite = new boolean[n + 1];
        for (int i = 2; i * i <= n; i++) {
            if (!composite[i]) {
                for (int j = i * i; j <= n; j += i) composite[j] = true;
            }
        }
        for (int i = 2; i <= n; i++) {
            if (!composite[i]) System.out.print(i + " ");
        }
        System.out.println();
    }
}
