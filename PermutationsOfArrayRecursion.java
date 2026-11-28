import java.util.*;

public class PermutationsOfArrayRecursion
{
    public static void main(String[] args) {
        permute(new int[]{1, 2, 3}, 0);
    }

    static void permute(int[] a, int k) {
        if (k == a.length) {
            System.out.println(Arrays.toString(a));
            return;
        }
        for (int i = k; i < a.length; i++) {
            int t = a[k]; a[k] = a[i]; a[i] = t;
            permute(a, k + 1);
            t = a[k]; a[k] = a[i]; a[i] = t;
        }
    }
}
