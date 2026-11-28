import java.util.*;

public class StreamAverage
{
    public static void main(String[] args) {
        int[] marks = {70, 80, 90};
        System.out.println(Arrays.stream(marks).average().getAsDouble());
    }
}
