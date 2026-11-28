public class StrategyPatternDemo
{
    public static void main(String[] args) {
        Context c = new Context(new Add());
        System.out.println(c.run(6, 3));
        c = new Context(new Multiply());
        System.out.println(c.run(6, 3));
    }

    interface Strategy { int apply(int a, int b); }
    static class Add implements Strategy { public int apply(int a, int b) { return a + b; } }
    static class Multiply implements Strategy { public int apply(int a, int b) { return a * b; } }
    static class Context {
        Strategy s;
        Context(Strategy s) { this.s = s; }
        int run(int a, int b) { return s.apply(a, b); }
    }
}
