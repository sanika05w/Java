import java.util.*;

public class StreamAnyMatchAllMatch
{
    public static void main(String[] args) {
        List<Integer> l = List.of(2, 4, 6, 8);
        System.out.println(l.stream().allMatch(x -> x % 2 == 0));
        System.out.println(l.stream().anyMatch(x -> x > 7));
        System.out.println(l.stream().noneMatch(x -> x < 0));
    }
}
