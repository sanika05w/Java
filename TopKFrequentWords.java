import java.util.*;

public class TopKFrequentWords
{
    public static void main(String[] args) {
        String[] w = "a b a c b a d b a".split(" ");
        Map<String, Integer> m = new HashMap<>();
        for (String x : w) m.merge(x, 1, Integer::sum);
        m.entrySet().stream()
            .sorted((a, b) -> b.getValue() - a.getValue() != 0 ? b.getValue() - a.getValue() : a.getKey().compareTo(b.getKey()))
            .limit(2)
            .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    }
}
