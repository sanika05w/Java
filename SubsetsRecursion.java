import java.util.*;

public class SubsetsRecursion
{
    public static void main(String[] args) {
        subsets(new int[]{1, 2, 3}, 0, new ArrayList<>());
    }

    static void subsets(int[] a, int i, List<Integer> cur) {
        if (i == a.length) {
            System.out.println(cur);
            return;
        }
        subsets(a, i + 1, cur);
        cur.add(a[i]);
        subsets(a, i + 1, cur);
        cur.remove(cur.size() - 1);
    }
}
