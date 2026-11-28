public class StringChunks
{
    public static void main(String[] args) {
        String s = "abcdefghij";
        int k = 3;
        for (int i = 0; i < s.length(); i += k) System.out.println(s.substring(i, Math.min(i + k, s.length())));
    }
}
