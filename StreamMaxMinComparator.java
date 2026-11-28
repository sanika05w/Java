import java.util.*;

public class StreamMaxMinComparator
{
    public static void main(String[] args) {
        List<String> l = List.of("kiwi", "banana", "fig");
        System.out.println(l.stream().max(Comparator.comparingInt(String::length)).get());
        System.out.println(l.stream().min(Comparator.comparingInt(String::length)).get());
    }
}
