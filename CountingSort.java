import java.util.*;

public class CountingSort
{
    public static void main(String[] args) {
        int[] a = {4, 2, 2, 8, 3, 3, 1};
        int max = Arrays.stream(a).max().getAsInt();
        int[] count = new int[max + 1];
        for (int x : a) count[x]++;
        int k = 0;
        for (int v = 0; v <= max; v++) while (count[v]-- > 0) a[k++] = v;
        System.out.println(Arrays.toString(a));
    }
}
