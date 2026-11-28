import java.util.*;

public class FrequencyOfElements
{
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 3, 3};
        Map<Integer, Integer> m = new TreeMap<>();
        for (int x : a) m.put(x, m.getOrDefault(x, 0) + 1);
        System.out.println(m);
    }
}
