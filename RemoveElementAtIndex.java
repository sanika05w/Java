import java.util.*;

public class RemoveElementAtIndex
{
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40, 50};
        int idx = 2;
        int[] r = new int[a.length - 1];
        for (int i = 0, k = 0; i < a.length; i++) if (i != idx) r[k++] = a[i];
        System.out.println(Arrays.toString(r));
    }
}
