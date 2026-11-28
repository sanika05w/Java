import java.util.*;

public class MapKeySetValues
{
    public static void main(String[] args) {
        Map<String, Integer> m = new TreeMap<>();
        m.put("one", 1); m.put("two", 2); m.put("three", 3);
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.containsKey("two") + " " + m.containsValue(9));
    }
}
