public class PasswordStrengthCheck
{
    public static void main(String[] args) {
        String p = "Java@2026";
        boolean len = p.length() >= 8;
        boolean up = !p.equals(p.toLowerCase());
        boolean low = !p.equals(p.toUpperCase());
        boolean dig = p.matches(".*[0-9].*");
        System.out.println(len && up && low && dig ? "Strong password" : "Weak password");
    }
}
