import java.util.*;
import java.util.concurrent.*;

public class ConcurrentHashMapDemo
{
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> m = new ConcurrentHashMap<>();
        m.put("a", 1); m.putIfAbsent("a", 2); m.putIfAbsent("b", 3);
        System.out.println(new TreeMap<>(m));
    }
}
