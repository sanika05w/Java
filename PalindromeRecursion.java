public class PalindromeRecursion
{
    public static void main(String[] args) {
        System.out.println(isPal("racecar", 0, 6));
        System.out.println(isPal("hello", 0, 4));
    }

    static boolean isPal(String s, int l, int r) {
        if (l >= r) return true;
        return s.charAt(l) == s.charAt(r) && isPal(s, l + 1, r - 1);
    }
}
