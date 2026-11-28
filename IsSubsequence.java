public class IsSubsequence
{
    public static void main(String[] args) {
        String s = "ace", t = "abcde";
        int i = 0;
        for (char c : t.toCharArray()) if (i < s.length() && s.charAt(i) == c) i++;
        System.out.println(i == s.length() ? "Is a subsequence" : "Not a subsequence");
    }
}
