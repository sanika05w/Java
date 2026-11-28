public class DuckNumber
{
    public static void main(String[] args) {
        String s = "3210";
        boolean duck = s.contains("0") && s.charAt(0) != '0';
        System.out.println(s + (duck ? " is a duck number" : " is not a duck number"));
    }
}
