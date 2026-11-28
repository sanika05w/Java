public class FactorialRecursion
{
    public static void main(String[] args) {
        System.out.println("5! = " + fact(5));
    }

    static long fact(int n) {
        return n <= 1 ? 1 : n * fact(n - 1);
    }
}
