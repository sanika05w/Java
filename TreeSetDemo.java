import java.util.*;

public class TreeSetDemo
{
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>(List.of(50, 10, 40, 20, 30));
        System.out.println(t);
        System.out.println("Smallest = " + t.first() + ", Largest = " + t.last());
    }
}
