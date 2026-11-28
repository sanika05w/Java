public class ArrayRange
{
    public static void main(String[] args) {
        int[] a = {14, 3, 27, 9, 18};
        int max = a[0], min = a[0];
        for (int x : a) { max = Math.max(max, x); min = Math.min(min, x); }
        System.out.println("Range = " + (max - min));
    }
}
