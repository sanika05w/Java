public class PalindromeIgnoreCase
{
    public static void main(String[] args) {
        String s = "Madam";
        String t = s.toLowerCase();
        System.out.println(s + (t.equals(new StringBuilder(t).reverse().toString()) ? " is a palindrome" : " is not a palindrome"));
    }
}
