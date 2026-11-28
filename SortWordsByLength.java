import java.util.*;

public class SortWordsByLength
{
    public static void main(String[] args) {
        String[] words = "pear apple fig banana kiwi".split(" ");
        Arrays.sort(words, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(words));
    }
}
