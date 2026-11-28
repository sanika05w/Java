import java.util.*;
import java.util.stream.*;

public class StreamSortedDistinct
{
    public static void main(String[] args) {
        List<Integer> l = List.of(5, 3, 5, 1, 3, 9);
        System.out.println(l.stream().distinct().sorted().collect(Collectors.toList()));
    }
}
