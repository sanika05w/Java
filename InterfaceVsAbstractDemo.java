public class InterfaceVsAbstractDemo
{
    public static void main(String[] args) {
        Bird b = new Sparrow();
        b.eat();
        b.fly();
    }

    interface Flyable { void fly(); }
    static abstract class Bird implements Flyable {
        void eat() { System.out.println("Eating seeds"); }
    }
    static class Sparrow extends Bird { public void fly() { System.out.println("Sparrow flying"); } }
}
