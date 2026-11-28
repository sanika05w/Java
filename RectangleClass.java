public class RectangleClass
{
    public static void main(String[] args) {
        Rectangle r = new Rectangle(6, 4);
        System.out.println("Area = " + r.area());
        System.out.println("Perimeter = " + r.perimeter());
    }

    static class Rectangle {
        int w, h;
        Rectangle(int w, int h) { this.w = w; this.h = h; }
        int area() { return w * h; }
        int perimeter() { return 2 * (w + h); }
    }
}
