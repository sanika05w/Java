import java.util.*;

public class HashMapDemo
{
    public static void main(String[] args) {
        Map<String, Integer> marks = new HashMap<>();
        marks.put("Asha", 90);
        marks.put("Ravi", 78);
        for (Map.Entry<String, Integer> e : marks.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}
