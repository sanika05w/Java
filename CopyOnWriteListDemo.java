import java.util.*;
import java.util.concurrent.*;

public class CopyOnWriteListDemo
{
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> l = new CopyOnWriteArrayList<>(List.of(1, 2, 3));
        for (int x : l) if (x == 2) l.add(99);
        System.out.println(l);
    }
}
