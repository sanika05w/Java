public class AnonymousClassDemo
{
    public static void main(String[] args) {
        Greeting g = new Greeting() {
            public void greet() { System.out.println("Hello from anonymous class"); }
        };
        g.greet();
    }

    interface Greeting { void greet(); }
}
