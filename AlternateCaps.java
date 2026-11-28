public class AlternateCaps
{
    public static void main(String[] args) {
        String s = "programming";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            sb.append(i % 2 == 0 ? Character.toUpperCase(ch) : ch);
        }
        System.out.println(sb);
    }
}
