public class FactoryPatternDemo
{
    public static void main(String[] args) {
        ShapeFactory.create("circle").draw();
        ShapeFactory.create("square").draw();
    }

    interface Shape { void draw(); }
    static class Circle implements Shape { public void draw() { System.out.println("Drawing circle"); } }
    static class Square implements Shape { public void draw() { System.out.println("Drawing square"); } }
    static class ShapeFactory {
        static Shape create(String t) { return t.equals("circle") ? new Circle() : new Square(); }
    }
}
