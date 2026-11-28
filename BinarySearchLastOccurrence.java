public class BinarySearchLastOccurrence
{
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 2, 3, 4};
        int key = 2, lo = 0, hi = a.length - 1, ans = -1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (a[mid] == key) { ans = mid; lo = mid + 1; }
            else if (a[mid] < key) lo = mid + 1;
            else hi = mid - 1;
        }
        System.out.println("Last occurrence at " + ans);
    }
}
