import java.util.*;

public class HashCodeEqualsInSet
{
    public static void main(String[] args) {
        Set<Point> s = new HashSet<>();
        s.add(new Point(1, 2));
        s.add(new Point(1, 2));
        s.add(new Point(3, 4));
        System.out.println("Set size = " + s.size());
    }

    static class Point {
        int x, y;
        Point(int x, int y) { this.x = x; this.y = y; }
        public boolean equals(Object o) { return o instanceof Point && ((Point) o).x == x && ((Point) o).y == y; }
        public int hashCode() { return Objects.hash(x, y); }
    }
}
