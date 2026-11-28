public class DecimalToOctalAndHex
{
    public static void main(String[] args) {
        int n = 255;
        System.out.println("Octal = " + Integer.toOctalString(n));
        System.out.println("Hex = " + Integer.toHexString(n).toUpperCase());
    }
}
