import java.util.*;

public class HashMapWordCount
{
    public static void main(String[] args) {
        String text = "to be or not to be";
        Map<String, Integer> count = new TreeMap<>();
        for (String w : text.split(" ")) count.put(w, count.getOrDefault(w, 0) + 1);
        System.out.println(count);
    }
}
