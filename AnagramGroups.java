import java.util.*;

public class AnagramGroups
{
    public static void main(String[] args) {
        String[] w = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Map<String, List<String>> g = new TreeMap<>();
        for (String s : w) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            g.computeIfAbsent(new String(c), k -> new ArrayList<>()).add(s);
        }
        System.out.println(g.values());
    }
}
