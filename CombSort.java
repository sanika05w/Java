import java.util.*;

public class CombSort
{
    public static void main(String[] args) {
        int[] a = {8, 4, 1, 56, 3, -44, 23, -6, 28, 0};
        int gap = a.length;
        boolean swapped = true;
        while (gap > 1 || swapped) {
            gap = Math.max(1, (int) (gap / 1.3));
            swapped = false;
            for (int i = 0; i + gap < a.length; i++)
                if (a[i] > a[i + gap]) { int t = a[i]; a[i] = a[i + gap]; a[i + gap] = t; swapped = true; }
        }
        System.out.println(Arrays.toString(a));
    }
}
