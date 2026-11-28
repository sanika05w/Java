import java.util.*;

public class ProductExceptSelf
{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int n = a.length;
        int[] r = new int[n];
        int left = 1;
        for (int i = 0; i < n; i++) { r[i] = left; left *= a[i]; }
        int right = 1;
        for (int i = n - 1; i >= 0; i--) { r[i] *= right; right *= a[i]; }
        System.out.println(Arrays.toString(r));
    }
}
