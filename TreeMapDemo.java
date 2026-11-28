import java.util.*;

public class TreeMapDemo
{
    public static void main(String[] args) {
        TreeMap<Integer, String> m = new TreeMap<>();
        m.put(30, "thirty"); m.put(10, "ten"); m.put(20, "twenty");
        System.out.println(m);
        System.out.println("First = " + m.firstKey() + ", Last = " + m.lastKey());
    }
}
