import java.util.*;

public class GenericStackClass
{
    public static void main(String[] args) {
        MyStack<String> s = new MyStack<>();
        s.push("a"); s.push("b"); s.push("c");
        System.out.println(s.pop() + s.pop() + s.pop());
    }

    static class MyStack<T> {
        private final List<T> items = new ArrayList<>();
        void push(T x) { items.add(x); }
        T pop() { return items.remove(items.size() - 1); }
    }
}
