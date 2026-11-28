import java.util.*;

public class ArrayListSort
{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(5, 2, 9, 1, 7));
        Collections.sort(list);
        System.out.println(list);
    }
}
