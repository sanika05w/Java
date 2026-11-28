import java.util.*;
import java.util.stream.*;

public class StreamFlatMap
{
    public static void main(String[] args) {
        List<List<Integer>> l = List.of(List.of(1, 2), List.of(3), List.of(4, 5));
        System.out.println(l.stream().flatMap(List::stream).collect(Collectors.toList()));
    }
}
