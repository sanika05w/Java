import java.util.*;
import java.util.stream.*;

public class StreamCollectJoining
{
    public static void main(String[] args) {
        List<String> l = List.of("Java", "Python", "C");
        System.out.println(l.stream().collect(Collectors.joining(", ", "[", "]")));
    }
}
