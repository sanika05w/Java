import java.util.Arrays;

public class MoveZerosToEnd
{
    public static void main(String[] args) {
        int[] a = {0, 1, 0, 3, 12};
        int idx = 0;
        for (int x : a) if (x != 0) a[idx++] = x;
        while (idx < a.length) a[idx++] = 0;
        System.out.println(Arrays.toString(a));
    }
}
