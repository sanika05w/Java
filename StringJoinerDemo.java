import java.util.*;

public class StringJoinerDemo
{
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        sj.add("one").add("two").add("three");
        System.out.println(sj);
    }
}
