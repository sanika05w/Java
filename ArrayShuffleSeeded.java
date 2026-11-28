import java.util.*;

public class ArrayShuffleSeeded
{
    public static void main(String[] args) {
        Integer[] a = {1, 2, 3, 4, 5, 6};
        List<Integer> l = Arrays.asList(a);
        Collections.shuffle(l, new Random(10));
        System.out.println(l);
    }
}
