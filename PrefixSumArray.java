import java.util.Arrays;

public class PrefixSumArray
{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] p = new int[a.length];
        p[0] = a[0];
        for (int i = 1; i < a.length; i++) p[i] = p[i - 1] + a[i];
        System.out.println(Arrays.toString(p));
    }
}
