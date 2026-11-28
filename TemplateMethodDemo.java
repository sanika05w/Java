public class TemplateMethodDemo
{
    public static void main(String[] args) {
        new Tea().make();
        System.out.println();
        new CoffeeDrink().make();
    }

    static abstract class Drink {
        final void make() { boil(); brew(); pour(); }
        void boil() { System.out.println("Boil water"); }
        abstract void brew();
        void pour() { System.out.println("Pour in cup"); }
    }
    static class Tea extends Drink { void brew() { System.out.println("Steep tea"); } }
    static class CoffeeDrink extends Drink { void brew() { System.out.println("Brew coffee"); } }
}
