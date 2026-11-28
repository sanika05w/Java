import java.util.*;

public class ModeOfArray
{
    public static void main(String[] args) {
        int[] a = {1, 3, 3, 5, 3, 1, 5, 5, 5};
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : a) freq.merge(x, 1, Integer::sum);
        int mode = a[0];
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            if (e.getValue() > freq.get(mode)) mode = e.getKey();
        }
        System.out.println("Mode = " + mode);
    }
}
