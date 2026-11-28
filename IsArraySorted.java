public class IsArraySorted
{
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9};
        boolean sorted = true;
        for (int i = 1; i < a.length; i++) if (a[i] < a[i - 1]) sorted = false;
        System.out.println(sorted ? "Sorted" : "Not sorted");
    }
}
