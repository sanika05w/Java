import java.util.*;

public class ArrayElementwiseSum
{
    public static void main(String[] args) {
        int[] a = {1, 2, 3}, b = {10, 20, 30};
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) c[i] = a[i] + b[i];
        System.out.println(Arrays.toString(c));
    }
}
