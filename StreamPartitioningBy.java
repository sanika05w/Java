import java.util.*;
import java.util.stream.*;

public class StreamPartitioningBy
{
    public static void main(String[] args) {
        List<Integer> l = List.of(1, 2, 3, 4, 5, 6);
        System.out.println(l.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0)));
    }
}
