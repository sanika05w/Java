public class ExtractDomainFromEmail
{
    public static void main(String[] args) {
        String email = "sanika@example.com";
        System.out.println("Domain = " + email.substring(email.indexOf('@') + 1));
    }
}
