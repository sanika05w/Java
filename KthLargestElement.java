import java.util.*;

public class KthLargestElement
{
    public static void main(String[] args) {
        int[] a = {7, 10, 4, 3, 20, 15};
        int k = 2;
        int[] c = a.clone();
        Arrays.sort(c);
        System.out.println(k + "nd largest = " + c[c.length - k]);
    }
}
