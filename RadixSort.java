import java.util.*;

public class RadixSort
{
    public static void main(String[] args) {
        int[] a = {170, 45, 75, 90, 802, 24, 2, 66};
        int max = Arrays.stream(a).max().getAsInt();
        for (int exp = 1; max / exp > 0; exp *= 10) {
            int[] out = new int[a.length], cnt = new int[10];
            for (int x : a) cnt[(x / exp) % 10]++;
            for (int i = 1; i < 10; i++) cnt[i] += cnt[i - 1];
            for (int i = a.length - 1; i >= 0; i--) out[--cnt[(a[i] / exp) % 10]] = a[i];
            a = out;
        }
        System.out.println(Arrays.toString(a));
    }
}
