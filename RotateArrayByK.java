import java.util.*;

public class RotateArrayByK
{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int k = 3, n = a.length;
        int[] r = new int[n];
        for (int i = 0; i < n; i++) r[(i + k) % n] = a[i];
        System.out.println(Arrays.toString(r));
    }
}
