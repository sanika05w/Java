public class InterpolationSearch
{
    public static void main(String[] args) {
        int[] a = {10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47};
        int key = 18, lo = 0, hi = a.length - 1;
        while (lo <= hi && key >= a[lo] && key <= a[hi]) {
            if (a[hi] == a[lo]) break;
            int pos = lo + (key - a[lo]) * (hi - lo) / (a[hi] - a[lo]);
            if (a[pos] == key) { System.out.println("Found at " + pos); return; }
            if (a[pos] < key) lo = pos + 1; else hi = pos - 1;
        }
        System.out.println("Not found");
    }
}
