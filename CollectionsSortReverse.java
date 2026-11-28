import java.util.*;

public class CollectionsSortReverse
{
    public static void main(String[] args) {
        List<String> l = new ArrayList<>(List.of("pear", "apple", "mango"));
        Collections.sort(l);
        System.out.println(l);
        Collections.reverse(l);
        System.out.println(l);
    }
}
