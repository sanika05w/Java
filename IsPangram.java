public class IsPangram
{
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog".toLowerCase();
        boolean ok = true;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (s.indexOf(ch) < 0) { ok = false; break; }
        }
        System.out.println(ok ? "Pangram" : "Not a pangram");
    }
}
