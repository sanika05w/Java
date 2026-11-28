public class ShapeAreaCalculator
{
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(3), new Rect(4, 5), new Tri(6, 2)};
        for (Shape s : shapes) System.out.printf("%s area = %.2f%n", s.getClass().getSimpleName(), s.area());
    }

    interface Shape { double area(); }
    static class Circle implements Shape {
        double r; Circle(double r) { this.r = r; }
        public double area() { return Math.PI * r * r; }
    }
    static class Rect implements Shape {
        double w, h; Rect(double w, double h) { this.w = w; this.h = h; }
        public double area() { return w * h; }
    }
    static class Tri implements Shape {
        double b, h; Tri(double b, double h) { this.b = b; this.h = h; }
        public double area() { return 0.5 * b * h; }
    }
}
