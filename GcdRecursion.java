public class GcdRecursion
{
    public static void main(String[] args) {
        System.out.println("GCD(48, 18) = " + gcd(48, 18));
    }

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
