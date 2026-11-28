import java.util.*;

public class PowerSetBitmask
{
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        for (int mask = 0; mask < (1 << a.length); mask++) {
            List<Integer> sub = new ArrayList<>();
            for (int i = 0; i < a.length; i++) if ((mask & (1 << i)) != 0) sub.add(a[i]);
            System.out.println(sub);
        }
    }
}
