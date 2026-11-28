import java.util.*;

public class SwapFirstAndLast
{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int t = a[0];
        a[0] = a[a.length - 1];
        a[a.length - 1] = t;
        System.out.println(Arrays.toString(a));
    }
}
