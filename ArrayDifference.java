import java.util.*;

public class ArrayDifference
{
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4}, b = {3, 4, 5};
        Set<Integer> set = new TreeSet<>(Arrays.asList(a));
        set.removeAll(Arrays.asList(b));
        System.out.println(set);
    }
}
