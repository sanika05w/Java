public class CoPrimeCheck
{
    public static void main(String[] args) {
        int a = 14, b = 15;
        System.out.println(a + " and " + b + (gcd(a, b) == 1 ? " are co-prime" : " are not co-prime"));
    }

    static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
