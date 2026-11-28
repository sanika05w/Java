public class PalindromeWordCount
{
    public static void main(String[] args) {
        String s = "madam level java noon racecar";
        int c = 0;
        for (String w : s.split(" ")) if (w.equals(new StringBuilder(w).reverse().toString())) c++;
        System.out.println("Palindrome words = " + c);
    }
}
