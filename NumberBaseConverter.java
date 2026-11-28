public class NumberBaseConverter
{
    public static void main(String[] args) {
        int n = 255;
        System.out.println("Binary : " + Integer.toString(n, 2));
        System.out.println("Octal  : " + Integer.toString(n, 8));
        System.out.println("Hex    : " + Integer.toString(n, 16));
        System.out.println("From hex ff : " + Integer.parseInt("ff", 16));
    }
}
