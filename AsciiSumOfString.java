public class AsciiSumOfString
{
    public static void main(String[] args) {
        String s = "Java";
        int sum = 0;
        for (char c : s.toCharArray()) sum += c;
        System.out.println("ASCII sum = " + sum);
    }
}
