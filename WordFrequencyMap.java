import java.util.*;

public class WordFrequencyMap
{
    public static void main(String[] args) {
        String s = "apple banana apple cherry banana apple";
        Map<String, Integer> m = new TreeMap<>();
        for (String w : s.split(" ")) m.merge(w, 1, Integer::sum);
        System.out.println(m);
    }
}
