public class FibonacciRecursion
{
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) System.out.print(fib(i) + " ");
        System.out.println();
    }

    static int fib(int n) {
        return n < 2 ? n : fib(n - 1) + fib(n - 2);
    }
}
