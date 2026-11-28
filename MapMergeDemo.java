import java.util.*;

public class MapMergeDemo
{
    public static void main(String[] args) {
        Map<Character, Integer> m = new TreeMap<>();
        for (char c : "banana".toCharArray()) m.merge(c, 1, Integer::sum);
        System.out.println(m);
    }
}
