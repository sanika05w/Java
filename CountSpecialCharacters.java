public class CountSpecialCharacters
{
    public static void main(String[] args) {
        String s = "He@llo #World! 123";
        int count = 0;
        for (char ch : s.toCharArray()) {
            if (!Character.isLetterOrDigit(ch) && ch != ' ') count++;
        }
        System.out.println("Special characters = " + count);
    }
}
