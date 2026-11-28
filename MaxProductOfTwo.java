public class MaxProductOfTwo
{
    public static void main(String[] args) {
        int[] a = {3, -10, 7, -2, 5};
        int best = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++)
            for (int j = i + 1; j < a.length; j++) best = Math.max(best, a[i] * a[j]);
        System.out.println("Max product = " + best);
    }
}
