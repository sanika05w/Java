import java.util.*;

public class LinkedHashSetDemo
{
    public static void main(String[] args) {
        Set<String> s = new LinkedHashSet<>();
        s.add("banana"); s.add("apple"); s.add("banana"); s.add("cherry");
        System.out.println(s);
    }
}
