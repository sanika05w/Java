public class FirstNonRepeatingChar
{
    public static void main(String[] args) {
        String s = "swiss";
        for (char ch : s.toCharArray()) {
            if (s.indexOf(ch) == s.lastIndexOf(ch)) {
                System.out.println("First non-repeating = " + ch);
                return;
            }
        }
        System.out.println("None");
    }
}
