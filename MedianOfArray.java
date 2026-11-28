import java.util.*;

public class MedianOfArray
{
    public static void main(String[] args) {
        int[] a = {7, 1, 5, 3, 9, 2};
        Arrays.sort(a);
        int n = a.length;
        double median = n % 2 == 0 ? (a[n / 2 - 1] + a[n / 2]) / 2.0 : a[n / 2];
        System.out.println("Median = " + median);
    }
}
