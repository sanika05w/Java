public class NthFibonacci
{
    public static void main(String[] args) {
        int n = 20;
        long a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            long c = a + b;
            a = b;
            b = c;
        }
        System.out.println("Fibonacci(" + n + ") = " + (n == 0 ? 0 : b));
    }
}
