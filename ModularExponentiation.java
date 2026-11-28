public class ModularExponentiation
{
    public static void main(String[] args) {
        long base = 7, exp = 128, mod = 13, result = 1;
        base %= mod;
        while (exp > 0) {
            if ((exp & 1) == 1) result = result * base % mod;
            base = base * base % mod;
            exp >>= 1;
        }
        System.out.println("7^128 mod 13 = " + result);
    }
}
