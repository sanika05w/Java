public class RunLengthDecode
{
    public static void main(String[] args) {
        String s = "a3b2c4";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) sb.append(String.valueOf(s.charAt(i)).repeat(s.charAt(i + 1) - '0'));
        System.out.println(sb);
    }
}
