import java.util.*;

public class LinkedListDemo
{
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>(List.of(10, 20, 30));
        ll.addFirst(5);
        ll.addLast(40);
        System.out.println(ll);
    }
}
