import java.util.*;

public class CombinationSum
{
    public static void main(String[] args) {
        find(new int[]{2, 3, 6, 7}, 7, 0, new ArrayList<>());
    }

    static void find(int[] c, int target, int start, List<Integer> cur) {
        if (target == 0) { System.out.println(cur); return; }
        for (int i = start; i < c.length; i++) {
            if (c[i] > target) continue;
            cur.add(c[i]);
            find(c, target - c[i], i, cur);
            cur.remove(cur.size() - 1);
        }
    }
}
