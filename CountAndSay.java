public class CountAndSay
{
    public static void main(String[] args) {
        String s = "1";
        for (int step = 1; step <= 6; step++) {
            System.out.println(s);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); ) {
                int j = i;
                while (j < s.length() && s.charAt(j) == s.charAt(i)) j++;
                sb.append(j - i).append(s.charAt(i));
                i = j;
            }
            s = sb.toString();
        }
    }
}
