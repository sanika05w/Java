public class ReverseVowelsOnly
{
    public static void main(String[] args) {
        char[] c = "hello world".toCharArray();
        int i = 0, j = c.length - 1;
        String v = "aeiouAEIOU";
        while (i < j) {
            while (i < j && v.indexOf(c[i]) < 0) i++;
            while (i < j && v.indexOf(c[j]) < 0) j--;
            char t = c[i]; c[i++] = c[j]; c[j--] = t;
        }
        System.out.println(new String(c));
    }
}
