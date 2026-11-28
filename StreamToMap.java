import java.util.*;
import java.util.stream.*;

public class StreamToMap
{
    public static void main(String[] args) {
        List<String> w = List.of("apple", "kiwi", "banana");
        Map<String, Integer> m = w.stream().collect(Collectors.toMap(s -> s, String::length, (a, b) -> a, LinkedHashMap::new));
        System.out.println(m);
    }
}
