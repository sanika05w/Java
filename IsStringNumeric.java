public class IsStringNumeric
{
    public static void main(String[] args) {
        String s = "12345";
        boolean numeric = !s.isEmpty();
        for (char ch : s.toCharArray()) {
            if (!Character.isDigit(ch)) { numeric = false; break; }
        }
        System.out.println(numeric ? "Numeric" : "Not numeric");
    }
}
