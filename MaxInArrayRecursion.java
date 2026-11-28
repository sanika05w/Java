public class MaxInArrayRecursion
{
    public static void main(String[] args) {
        int[] a = {12, 45, 7, 89, 23};
        System.out.println("Max = " + max(a, a.length));
    }

    static int max(int[] a, int n) {
        return n == 1 ? a[0] : Math.max(a[n - 1], max(a, n - 1));
    }
}
