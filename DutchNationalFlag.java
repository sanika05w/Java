import java.util.*;

public class DutchNationalFlag
{
    public static void main(String[] args) {
        int[] a = {2, 0, 2, 1, 1, 0};
        int lo = 0, mid = 0, hi = a.length - 1;
        while (mid <= hi) {
            if (a[mid] == 0) { int t = a[lo]; a[lo++] = a[mid]; a[mid++] = t; }
            else if (a[mid] == 1) mid++;
            else { int t = a[mid]; a[mid] = a[hi]; a[hi--] = t; }
        }
        System.out.println(Arrays.toString(a));
    }
}
