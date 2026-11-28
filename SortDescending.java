import java.util.*;

public class SortDescending
{
    public static void main(String[] args) {
        Integer[] a = {9, 3, 7, 1, 8};
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println(Arrays.toString(a));
    }
}
