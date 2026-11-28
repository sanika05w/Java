import java.util.*;

public class KthSmallestElement
{
    public static void main(String[] args) {
        int[] a = {7, 10, 4, 3, 20, 15};
        int k = 3;
        int[] c = a.clone();
        Arrays.sort(c);
        System.out.println(k + "rd smallest = " + c[k - 1]);
    }
}
