public class MinimumInRotatedArray
{
    public static void main(String[] args) {
        int[] a = {4, 5, 6, 7, 0, 1, 2};
        int lo = 0, hi = a.length - 1;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (a[mid] > a[hi]) lo = mid + 1; else hi = mid;
        }
        System.out.println("Minimum = " + a[lo]);
    }
}
