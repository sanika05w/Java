import java.util.*;

public class RemoveDuplicatesSorted
{
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 2, 3, 4, 4};
        int idx = 1;
        for (int i = 1; i < a.length; i++) if (a[i] != a[i - 1]) a[idx++] = a[i];
        System.out.println(Arrays.toString(Arrays.copyOf(a, idx)));
    }
}
