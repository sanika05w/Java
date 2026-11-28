public class LongestPalindromeSubstring
{
    public static void main(String[] args) {
        String s = "babad";
        String best = "";
        for (int c = 0; c < s.length(); c++) {
            for (int w = 0; w < 2; w++) {
                int l = c, r = c + w;
                while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) { l--; r++; }
                if (r - l - 1 > best.length()) best = s.substring(l + 1, r);
            }
        }
        System.out.println("Longest palindrome = " + best);
    }
}
