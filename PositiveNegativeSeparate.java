import java.util.*;

public class PositiveNegativeSeparate
{
    public static void main(String[] args) {
        int[] a = {4, -1, 7, -3, 0, -8, 2};
        List<Integer> pos = new ArrayList<>(), neg = new ArrayList<>();
        for (int x : a) { if (x >= 0) pos.add(x); else neg.add(x); }
        System.out.println("Positive: " + pos);
        System.out.println("Negative: " + neg);
    }
}
