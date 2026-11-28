public class StringCharAtLoop
{
    public static void main(String[] args) {
        String s = "Java";
        for (int i = 0; i < s.length(); i++) {
            System.out.println("Index " + i + " -> " + s.charAt(i));
        }
    }
}
