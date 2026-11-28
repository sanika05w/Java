import java.util.*;

public class ThirdLargestElement
{
    public static void main(String[] args) {
        Integer[] a = {45, 12, 89, 33, 67, 5};
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("Third largest = " + a[2]);
    }
}
