public class CenterTextPadding
{
    public static void main(String[] args) {
        String s = "Java";
        int width = 20;
        int left = (width - s.length()) / 2;
        System.out.println("[" + " ".repeat(left) + s + " ".repeat(width - s.length() - left) + "]");
    }
}
