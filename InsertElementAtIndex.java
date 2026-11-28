import java.util.*;

public class InsertElementAtIndex
{
    public static void main(String[] args) {
        int[] a = {10, 20, 40, 50};
        int idx = 2, val = 30;
        int[] r = new int[a.length + 1];
        for (int i = 0, k = 0; i < r.length; i++) r[i] = (i == idx) ? val : a[k++];
        System.out.println(Arrays.toString(r));
    }
}
