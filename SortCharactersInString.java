import java.util.*;

public class SortCharactersInString
{
    public static void main(String[] args) {
        String s = "javaprogram";
        char[] c = s.toCharArray();
        Arrays.sort(c);
        System.out.println(String.valueOf(c));
    }
}
