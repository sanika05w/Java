public class PalindromeNumber
{
    public static void main(String[] args) {
        int n = 12321, original = n, rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        System.out.println(original + (rev == original ? " is a palindrome" : " is not a palindrome"));
    }
}
