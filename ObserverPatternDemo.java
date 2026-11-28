import java.util.*;

public class ObserverPatternDemo
{
    public static void main(String[] args) {
        Subject s = new Subject();
        s.attach(msg -> System.out.println("Observer 1 got: " + msg));
        s.attach(msg -> System.out.println("Observer 2 got: " + msg));
        s.notifyAll("Hello!");
    }

    interface Listener { void update(String msg); }
    static class Subject {
        List<Listener> list = new ArrayList<>();
        void attach(Listener l) { list.add(l); }
        void notifyAll(String m) { for (Listener l : list) l.update(m); }
    }
}
