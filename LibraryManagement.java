import java.util.*;

public class LibraryManagement
{
    public static void main(String[] args) {
        Library lib = new Library();
        lib.add("Java Basics");
        lib.add("Data Structures");
        lib.issue("Java Basics");
        lib.issue("Java Basics");
        lib.show();
    }

    static class Library {
        Map<String, Boolean> books = new LinkedHashMap<>();
        void add(String t) { books.put(t, true); }
        void issue(String t) {
            if (books.getOrDefault(t, false)) { books.put(t, false); System.out.println("Issued: " + t); }
            else System.out.println("Not available: " + t);
        }
        void show() { books.forEach((k, v) -> System.out.println(k + " -> " + (v ? "available" : "issued"))); }
    }
}
