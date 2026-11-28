public class StringSwapCharacters
{
    public static void main(String[] args) {
        char[] c = "hello".toCharArray();
        char t = c[0];
        c[0] = c[c.length - 1];
        c[c.length - 1] = t;
        System.out.println(new String(c));
    }
}
