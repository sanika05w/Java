public class TernarySearch
{
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9, 11, 13, 15};
        int key = 11, lo = 0, hi = a.length - 1;
        while (lo <= hi) {
            int m1 = lo + (hi - lo) / 3, m2 = hi - (hi - lo) / 3;
            if (a[m1] == key) { System.out.println("Found at " + m1); return; }
            if (a[m2] == key) { System.out.println("Found at " + m2); return; }
            if (key < a[m1]) hi = m1 - 1;
            else if (key > a[m2]) lo = m2 + 1;
            else { lo = m1 + 1; hi = m2 - 1; }
        }
        System.out.println("Not found");
    }
}
