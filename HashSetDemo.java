import java.util.*;

public class HashSetDemo
{
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 2, 3, 3, 4));
        System.out.println(set);
    }
}
