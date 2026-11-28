import java.util.*;

public class QueueDemo
{
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.offer("A");
        q.offer("B");
        q.offer("C");
        System.out.println("Removed = " + q.poll());
        System.out.println(q);
    }
}
