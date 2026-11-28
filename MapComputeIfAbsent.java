import java.util.*;

public class MapComputeIfAbsent
{
    public static void main(String[] args) {
        Map<String, List<Integer>> m = new TreeMap<>();
        m.computeIfAbsent("even", k -> new ArrayList<>()).add(2);
        m.computeIfAbsent("even", k -> new ArrayList<>()).add(4);
        m.computeIfAbsent("odd", k -> new ArrayList<>()).add(1);
        System.out.println(m);
    }
}
