import java.util.*;

public class SortMapByValue
{
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        m.put("Asha", 85); m.put("Ravi", 72); m.put("Meera", 91);
        List<Map.Entry<String, Integer>> list = new ArrayList<>(m.entrySet());
        list.sort(Map.Entry.comparingByValue());
        for (Map.Entry<String, Integer> e : list) System.out.println(e.getKey() + " = " + e.getValue());
    }
}
