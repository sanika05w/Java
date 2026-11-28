public class CamelToSnakeCase
{
    public static void main(String[] args) {
        String s = "userAccountName";
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) sb.append('_').append(Character.toLowerCase(c));
            else sb.append(c);
        }
        System.out.println(sb);
    }
}
