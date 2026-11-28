import java.util.*;

public class QuickSort
{
    public static void main(String[] args) {
        int[] a = {10, 7, 8, 9, 1, 5};
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    static void quickSort(int[] a, int lo, int hi) {
        if (lo >= hi) return;
        int p = a[hi], i = lo;
        for (int j = lo; j < hi; j++) {
            if (a[j] < p) { int t = a[i]; a[i] = a[j]; a[j] = t; i++; }
        }
        int t = a[i]; a[i] = a[hi]; a[hi] = t;
        quickSort(a, lo, i - 1);
        quickSort(a, i + 1, hi);
    }
}
