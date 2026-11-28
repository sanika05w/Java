public class LetterCombinationsPhone
{
    public static void main(String[] args) {
        String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        combine("23", 0, "", map);
    }

    static void combine(String d, int i, String cur, String[] map) {
        if (i == d.length()) { System.out.println(cur); return; }
        for (char c : map[d.charAt(i) - '0'].toCharArray()) combine(d, i + 1, cur + c, map);
    }
}
