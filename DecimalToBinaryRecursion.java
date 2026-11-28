public class DecimalToBinaryRecursion
{
    public static void main(String[] args) {
        System.out.println(toBinary(37));
    }

    static String toBinary(int n) {
        return n < 2 ? String.valueOf(n) : toBinary(n / 2) + (n % 2);
    }
}
