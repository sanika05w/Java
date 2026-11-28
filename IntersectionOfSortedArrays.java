public class IntersectionOfSortedArrays
{
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 6}, b = {2, 3, 5, 7};
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) { System.out.print(a[i] + " "); i++; j++; }
            else if (a[i] < b[j]) i++;
            else j++;
        }
        System.out.println();
    }
}
