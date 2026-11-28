import java.util.*;

public class ArrayListIterate
{
    public static void main(String[] args) {
        List<String> list = List.of("red", "green", "blue");
        for (String s : list) System.out.println(s);
        list.forEach(s -> System.out.print(s.toUpperCase() + " "));
        System.out.println();
    }
}
