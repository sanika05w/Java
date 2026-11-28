public class BinarySearch
{
    public static void main(String[] args) {
        int[] a = {2, 5, 8, 12, 16, 23, 38};
        int key = 23, low = 0, high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == key) { System.out.println("Found at index " + mid); return; }
            if (a[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        System.out.println("Not found");
    }
}
