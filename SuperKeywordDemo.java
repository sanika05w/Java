public class SuperKeywordDemo
{
    public static void main(String[] args) {
        new Child().show();
    }

    static class Parent {
        String name = "Parent";
        void show() { System.out.println("Parent show"); }
    }
    static class Child extends Parent {
        String name = "Child";
        void show() {
            super.show();
            System.out.println(name + " / " + super.name);
        }
    }
}
