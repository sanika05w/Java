public class CountUpperLowerDigits
{
    public static void main(String[] args) {
        String s = "Java17 Is Great 2026";
        int u = 0, l = 0, d = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) u++;
            else if (Character.isLowerCase(ch)) l++;
            else if (Character.isDigit(ch)) d++;
        }
        System.out.println("Upper=" + u + " Lower=" + l + " Digits=" + d);
    }
}
