import java.util.stream.*;

public class StreamIterateGenerate
{
    public static void main(String[] args) {
        System.out.println(Stream.iterate(1, x -> x * 2).limit(10).collect(Collectors.toList()));
    }
}
