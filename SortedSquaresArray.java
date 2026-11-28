import java.util.*;

public class SortedSquaresArray
{
    public static void main(String[] args) {
        int[] a = {-4, -1, 0, 3, 10};
        int[] r = new int[a.length];
        for (int i = 0; i < a.length; i++) r[i] = a[i] * a[i];
        Arrays.sort(r);
        System.out.println(Arrays.toString(r));
    }
}
