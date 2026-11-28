import java.util.*;

public class ArrayListDemo
{
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.remove("Python");
        System.out.println(list + " size=" + list.size());
    }
}
