public class RemoveDuplicateChars
{
    public static void main(String[] args) {
        String s = "programming";
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (sb.indexOf(String.valueOf(ch)) < 0) sb.append(ch);
        }
        System.out.println(sb);
    }
}
