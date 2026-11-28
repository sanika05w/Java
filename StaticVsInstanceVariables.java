public class StaticVsInstanceVariables
{
    public static void main(String[] args) {
        Counter a = new Counter(), b = new Counter();
        a.inc(); a.inc(); b.inc();
        System.out.println("a.instance=" + a.instance + " b.instance=" + b.instance + " shared=" + Counter.shared);
    }

    static class Counter {
        static int shared = 0;
        int instance = 0;
        void inc() { instance++; shared++; }
    }
}
