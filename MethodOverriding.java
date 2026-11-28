public class MethodOverriding
{
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }

    static class Shape {
        void draw() { System.out.println("Drawing a shape"); }
    }
    static class Circle extends Shape {
        @Override
        void draw() { System.out.println("Drawing a circle"); }
    }
}
