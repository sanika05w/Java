public class ArraySumRecursion
{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println("Sum = " + sum(a, a.length));
    }

    static int sum(int[] a, int n) {
        return n == 0 ? 0 : a[n - 1] + sum(a, n - 1);
    }
}
