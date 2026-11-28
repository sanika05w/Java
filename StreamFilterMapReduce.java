import java.util.stream.*;

public class StreamFilterMapReduce
{
    public static void main(String[] args) {
        int r = IntStream.rangeClosed(1, 10).filter(x -> x % 2 == 1).map(x -> x * x).sum();
        System.out.println("Sum of squares of odd numbers = " + r);
    }
}
