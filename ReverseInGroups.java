import java.util.*;

public class ReverseInGroups
{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        int k = 3;
        for (int i = 0; i < a.length; i += k) {
            int l = i, r = Math.min(i + k - 1, a.length - 1);
            while (l < r) { int t = a[l]; a[l++] = a[r]; a[r--] = t; }
        }
        System.out.println(Arrays.toString(a));
    }
}
