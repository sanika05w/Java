import java.util.*;

public class FrequencySortCharacters
{
    public static void main(String[] args) {
        String s = "tree";
        Map<Character, Integer> m = new HashMap<>();
        for (char c : s.toCharArray()) m.merge(c, 1, Integer::sum);
        List<Character> chars = new ArrayList<>(m.keySet());
        chars.sort((a, b) -> m.get(b) - m.get(a));
        StringBuilder sb = new StringBuilder();
        for (char c : chars) sb.append(String.valueOf(c).repeat(m.get(c)));
        System.out.println(sb);
    }
}
