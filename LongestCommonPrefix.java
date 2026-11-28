public class LongestCommonPrefix
{
    public static void main(String[] args) {
        String[] a = {"flower", "flow", "flight"};
        String p = a[0];
        for (String s : a) while (!s.startsWith(p)) p = p.substring(0, p.length() - 1);
        System.out.println("Common prefix = " + p);
    }
}
