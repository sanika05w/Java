import java.util.*;

public class ArrayContainsDuplicate
{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 2};
        Set<Integer> s = new HashSet<>();
        boolean dup = false;
        for (int x : a) if (!s.add(x)) dup = true;
        System.out.println(dup ? "Contains duplicate" : "All unique");
    }
}
