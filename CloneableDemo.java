public class CloneableDemo
{
    public static void main(String[] args) {
        Item a = new Item("Pen", 10);
        Item b = (Item) a.clone();
        b.name = "Pencil";
        System.out.println(a.name + " " + b.name);
    }

    static class Item implements Cloneable {
        String name; int qty;
        Item(String n, int q) { name = n; qty = q; }
        public Object clone() {
            try { return super.clone(); } catch (CloneNotSupportedException e) { return null; }
        }
    }
}
