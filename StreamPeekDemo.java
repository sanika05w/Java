import java.util.*;
import java.util.stream.*;

public class StreamPeekDemo
{
    public static void main(String[] args) {
        List<Integer> r = Stream.of(1, 2, 3).peek(x -> System.out.println("Processing " + x)).map(x -> x * 2).collect(Collectors.toList());
        System.out.println(r);
    }
}
