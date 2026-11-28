public class ConstructorChaining
{
    public static void main(String[] args) {
        new Box();
        new Box(5);
        new Box(5, 6, 7);
    }

    static class Box {
        int l, w, h;
        Box() { this(1); }
        Box(int s) { this(s, s, s); }
        Box(int l, int w, int h) {
            this.l = l; this.w = w; this.h = h;
            System.out.println("Box " + l + "x" + w + "x" + h);
        }
    }
}
