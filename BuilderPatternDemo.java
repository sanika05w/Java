public class BuilderPatternDemo
{
    public static void main(String[] args) {
        Pizza p = new Pizza.Builder().size("Large").cheese(true).toppings("Olives").build();
        System.out.println(p);
    }

    static class Pizza {
        String size, toppings; boolean cheese;
        static class Builder {
            Pizza p = new Pizza();
            Builder size(String s) { p.size = s; return this; }
            Builder cheese(boolean c) { p.cheese = c; return this; }
            Builder toppings(String t) { p.toppings = t; return this; }
            Pizza build() { return p; }
        }
        public String toString() { return size + " pizza, cheese=" + cheese + ", toppings=" + toppings; }
    }
}
