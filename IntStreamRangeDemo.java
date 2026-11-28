import java.util.stream.*;

public class IntStreamRangeDemo
{
    public static void main(String[] args) {
        System.out.println(IntStream.range(0, 5).boxed().collect(Collectors.toList()));
        System.out.println(IntStream.rangeClosed(1, 5).sum());
    }
}
