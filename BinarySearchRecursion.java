public class BinarySearchRecursion
{
    public static void main(String[] args) {
        int[] a = {2, 5, 8, 12, 16, 23, 38};
        System.out.println("Index = " + search(a, 16, 0, a.length - 1));
    }

    static int search(int[] a, int key, int lo, int hi) {
        if (lo > hi) return -1;
        int mid = (lo + hi) / 2;
        if (a[mid] == key) return mid;
        return a[mid] < key ? search(a, key, mid + 1, hi) : search(a, key, lo, mid - 1);
    }
}
