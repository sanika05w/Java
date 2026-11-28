import java.util.*;

public class ListRemoveIf
{
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        l.removeIf(x -> x % 2 == 0);
        System.out.println(l);
    }
}
