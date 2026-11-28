import java.util.*;

public class IsogramCheck
{
    public static void main(String[] args) {
        String s = "lumberjack";
        Set<Character> seen = new HashSet<>();
        boolean iso = true;
        for (char c : s.toCharArray()) if (!seen.add(c)) iso = false;
        System.out.println(s + (iso ? " is an isogram" : " is not an isogram"));
    }
}
