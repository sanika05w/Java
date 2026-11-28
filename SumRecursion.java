public class SumRecursion
{
    public static void main(String[] args) {
        System.out.println("Sum of 1..10 = " + sum(10));
    }

    static int sum(int n) {
        return n == 0 ? 0 : n + sum(n - 1);
    }
}
