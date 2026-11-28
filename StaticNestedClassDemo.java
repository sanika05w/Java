public class StaticNestedClassDemo
{
    public static void main(String[] args) {
        Outer.Nested n = new Outer.Nested();
        n.hello();
    }

    static class Outer {
        static class Nested {
            void hello() { System.out.println("Hello from static nested class"); }
        }
    }
}
