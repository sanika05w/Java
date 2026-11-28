public class EmailValidator
{
    public static void main(String[] args) {
        String email = "sanika@example.com";
        boolean ok = email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
        System.out.println(ok ? "Valid email" : "Invalid email");
    }
}
