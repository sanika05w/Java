public class SnakeToCamelCase
{
    public static void main(String[] args) {
        String s = "user_account_name";
        StringBuilder sb = new StringBuilder();
        boolean up = false;
        for (char c : s.toCharArray()) {
            if (c == '_') up = true;
            else { sb.append(up ? Character.toUpperCase(c) : c); up = false; }
        }
        System.out.println(sb);
    }
}
