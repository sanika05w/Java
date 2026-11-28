public class InnerClassDemo
{
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.show();
    }

    static class Outer {
        int x = 42;
        class Inner {
            void show() { System.out.println("Outer x = " + x); }
        }
    }
}
