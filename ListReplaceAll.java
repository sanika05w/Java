import java.util.*;

public class ListReplaceAll
{
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(List.of(1, 2, 3, 4));
        l.replaceAll(x -> x * 10);
        System.out.println(l);
    }
}
