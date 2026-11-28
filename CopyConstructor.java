public class CopyConstructor
{
    public static void main(String[] args) {
        Point a = new Point(3, 4);
        Point b = new Point(a);
        b.x = 99;
        System.out.println(a + " " + b);
    }

    static class Point {
        int x, y;
        Point(int x, int y) { this.x = x; this.y = y; }
        Point(Point p) { this(p.x, p.y); }
        public String toString() { return "(" + x + "," + y + ")"; }
    }
}
