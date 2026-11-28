import java.util.*;

public class ListToSetConversion
{
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 2, 3, 3, 3);
        Set<Integer> s = new TreeSet<>(l);
        System.out.println(l + " -> " + s);
    }
}
