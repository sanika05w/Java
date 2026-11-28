public class ReplaceNthOccurrence
{
    public static void main(String[] args) {
        String s = "a-b-c-d-e";
        int n = 2, idx = -1;
        for (int i = 0; i < n; i++) idx = s.indexOf('-', idx + 1);
        System.out.println(s.substring(0, idx) + "+" + s.substring(idx + 1));
    }
}
