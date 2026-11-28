import java.util.*;

public class CocktailSort
{
    public static void main(String[] args) {
        int[] a = {5, 1, 4, 2, 8, 0};
        boolean swapped = true;
        int lo = 0, hi = a.length - 1;
        while (swapped) {
            swapped = false;
            for (int i = lo; i < hi; i++) if (a[i] > a[i + 1]) { int t = a[i]; a[i] = a[i + 1]; a[i + 1] = t; swapped = true; }
            hi--;
            for (int i = hi; i > lo; i--) if (a[i] < a[i - 1]) { int t = a[i]; a[i] = a[i - 1]; a[i - 1] = t; swapped = true; }
            lo++;
        }
        System.out.println(Arrays.toString(a));
    }
}
