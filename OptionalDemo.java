import java.util.*;

public class OptionalDemo
{
    public static void main(String[] args) {
        Optional<String> a = Optional.of("Java");
        Optional<String> b = Optional.empty();
        System.out.println(a.orElse("none"));
        System.out.println(b.orElse("none"));
        System.out.println(a.isPresent());
    }
}
