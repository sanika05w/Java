import java.util.*;

public class ArrayAlternateSign
{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, -4, -1, 4};
        List<Integer> pos = new ArrayList<>(), neg = new ArrayList<>();
        for (int x : a) (x >= 0 ? pos : neg).add(x);
        List<Integer> r = new ArrayList<>();
        for (int i = 0; i < Math.max(pos.size(), neg.size()); i++) {
            if (i < pos.size()) r.add(pos.get(i));
            if (i < neg.size()) r.add(neg.get(i));
        }
        System.out.println(r);
    }
}
