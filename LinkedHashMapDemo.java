import java.util.*;

public class LinkedHashMapDemo
{
    public static void main(String[] args) {
        Map<String, Integer> m = new LinkedHashMap<>();
        m.put("one", 1); m.put("two", 2); m.put("three", 3);
        System.out.println(m);
    }
}
