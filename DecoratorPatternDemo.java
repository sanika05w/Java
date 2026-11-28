public class DecoratorPatternDemo
{
    public static void main(String[] args) {
        Coffee c = new Milk(new Sugar(new Plain()));
        System.out.println(c.desc() + " = " + c.cost());
    }

    interface Coffee { String desc(); double cost(); }
    static class Plain implements Coffee {
        public String desc() { return "Coffee"; }
        public double cost() { return 50; }
    }
    static class Milk implements Coffee {
        Coffee c; Milk(Coffee c) { this.c = c; }
        public String desc() { return c.desc() + " + Milk"; }
        public double cost() { return c.cost() + 10; }
    }
    static class Sugar implements Coffee {
        Coffee c; Sugar(Coffee c) { this.c = c; }
        public String desc() { return c.desc() + " + Sugar"; }
        public double cost() { return c.cost() + 5; }
    }
}
