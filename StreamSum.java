import java.util.*;

public class StreamSum
{
    public static void main(String[] args) {
        List<Integer> l = List.of(1, 2, 3, 4, 5);
        System.out.println(l.stream().mapToInt(Integer::intValue).sum());
    }
}
