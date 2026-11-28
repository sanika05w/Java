import java.util.*;

public class DequeDemo
{
    public static void main(String[] args) {
        Deque<Integer> d = new ArrayDeque<>();
        d.addFirst(2); d.addFirst(1); d.addLast(3);
        System.out.println(d);
        System.out.println(d.pollFirst() + " " + d.pollLast());
    }
}
