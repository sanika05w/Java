import java.util.*;

public class ShellSort
{
    public static void main(String[] args) {
        int[] a = {12, 34, 54, 2, 3, 99, 7};
        for (int gap = a.length / 2; gap > 0; gap /= 2)
            for (int i = gap; i < a.length; i++) {
                int t = a[i], j = i;
                while (j >= gap && a[j - gap] > t) { a[j] = a[j - gap]; j -= gap; }
                a[j] = t;
            }
        System.out.println(Arrays.toString(a));
    }
}
