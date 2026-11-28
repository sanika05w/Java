import java.util.*;

public class SortWordsAlphabetically
{
    public static void main(String[] args) {
        String[] words = "pear apple mango banana".split(" ");
        Arrays.sort(words);
        System.out.println(String.join(" ", words));
    }
}
