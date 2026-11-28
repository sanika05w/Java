public class AbstractClassDemo
{
    public static void main(String[] args) {
        Shape s = new Rectangle(4, 5);
       
        System.out.println("Area of diagram= " + s.area());
    }

    static abstract class Shape {
        abstract double area();
    }
    static class Rectangle extends Shape {
        double w, h;
        Rectangle(double w, double h) { this.w = w; this.h = h; }
        double area() { return w * h; }
    }
}
