import java.util.*;

public class GenericQueueClass
{
    public static void main(String[] args) {
        MyQueue<Integer> q = new MyQueue<>();
        q.add(1); q.add(2); q.add(3);
        System.out.println(q.remove() + " " + q.remove());
    }

    static class MyQueue<T> {
        private final LinkedList<T> items = new LinkedList<>();
        void add(T x) { items.addLast(x); }
        T remove() { return items.removeFirst(); }
    }
}
