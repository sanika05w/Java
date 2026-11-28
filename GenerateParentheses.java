public class GenerateParentheses
{
    public static void main(String[] args) {
        gen("", 0, 0, 3);
    }

    static void gen(String s, int open, int close, int n) {
        if (s.length() == 2 * n) { System.out.println(s); return; }
        if (open < n) gen(s + "(", open + 1, close, n);
        if (close < open) gen(s + ")", open, close + 1, n);
    }
}
