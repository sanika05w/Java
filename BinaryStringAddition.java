public class BinaryStringAddition
{
    public static void main(String[] args) {
        String a = "1011", b = "110";
        int x = Integer.parseInt(a, 2), y = Integer.parseInt(b, 2);
        System.out.println(a + " + " + b + " = " + Integer.toBinaryString(x + y));
    }
}
