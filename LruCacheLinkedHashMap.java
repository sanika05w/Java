import java.util.*;

public class LruCacheLinkedHashMap
{
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> c = new LinkedHashMap<Integer, String>(16, 0.75f, true) {
            protected boolean removeEldestEntry(Map.Entry<Integer, String> e) { return size() > 3; }
        };
        c.put(1, "a"); c.put(2, "b"); c.put(3, "c");
        c.get(1);
        c.put(4, "d");
        System.out.println(c.keySet());
    }
}
