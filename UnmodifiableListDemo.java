import java.util.*;

public class UnmodifiableListDemo
{
    public static void main(String[] args) {
        List<String> l = Collections.unmodifiableList(new ArrayList<>(List.of("a", "b")));
        try {
            l.add("c");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify an unmodifiable list");
        }
    }
}
