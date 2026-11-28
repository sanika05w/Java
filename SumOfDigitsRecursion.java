public class SumOfDigitsRecursion
{
    public static void main(String[] args) {
        System.out.println("Sum = " + sum(12345));
    }

    static int sum(int n) {
        return n == 0 ? 0 : n % 10 + sum(n / 10);
    }
}
