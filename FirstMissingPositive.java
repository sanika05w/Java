import java.util.*;

public class FirstMissingPositive
{
    public static void main(String[] args) {
        int[] a = {3, 4, -1, 1};
        Set<Integer> s = new HashSet<>();
        for (int x : a) s.add(x);
        int i = 1;
        while (s.contains(i)) i++;
        System.out.println("First missing positive = " + i);
    }
}
