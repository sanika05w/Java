public class PalindromeString
{
    public static void main(String[] args) {
        String s = "madam";
        String rev = new StringBuilder(s).reverse().toString();
        System.out.println(s + (s.equals(rev) ? " is a palindrome" : " is not a palindrome"));
    }
}
