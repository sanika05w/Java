import java.util.*;

public class FirstRepeatingCharacter
{
    public static void main(String[] args) {
        String s = "programming";
        Set<Character> seen = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (!seen.add(c)) { System.out.println("First repeating = " + c); return; }
        }
        System.out.println("No repeating character");
    }
}
