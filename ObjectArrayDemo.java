public class ObjectArrayDemo
{
    public static void main(String[] args) {
        Book[] books = {new Book("Java Basics", 450), new Book("Data Structures", 520)};
        for (Book b : books) System.out.println(b.title + " - Rs. " + b.price);
    }

    static class Book {
        String title;
        int price;
        Book(String title, int price) { this.title = title; this.price = price; }
    }
}
