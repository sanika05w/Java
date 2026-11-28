import java.util.*;

public class FibonacciMemoization
{
    public static void main(String[] args) {
        System.out.println("fib(50) = " + fib(50));
    }

    static Map<Integer, Long> memo = new HashMap<>();
    static long fib(int n) {
        if (n < 2) return n;
        if (memo.containsKey(n)) return memo.get(n);
        long v = fib(n - 1) + fib(n - 2);
        memo.put(n, v);
        return v;
    }
}
