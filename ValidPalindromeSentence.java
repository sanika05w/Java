public class ValidPalindromeSentence
{
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String t = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        System.out.println(t.equals(new StringBuilder(t).reverse().toString()) ? "Valid palindrome" : "Not a palindrome");
    }
}
