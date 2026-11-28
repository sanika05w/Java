import java.util.*;

public class ArrayListContains
{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Java", "Python", "C"));
        System.out.println(list.contains("Python"));
        System.out.println(list.indexOf("C"));
    }
}
