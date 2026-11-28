public class AsciiValues
{
    public static void main(String[] args) {
        String s = "ABC";
        for (char ch : s.toCharArray()) {
            System.out.println(ch + " = " + (int) ch);
        }
    }
}
