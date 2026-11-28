import java.util.stream.*;

public class StreamLimitSkip
{
    public static void main(String[] args) {
        System.out.println(Stream.iterate(1, x -> x + 1).skip(5).limit(5).collect(Collectors.toList()));
    }
}
