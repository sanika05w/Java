public class CheckPowerOfTwo
{
    public static void main(String[] args) {
        int n = 64;
        boolean ok = n > 0 && (n & (n - 1)) == 0;
        System.out.println(n + (ok ? " is a power of 2" : " is not a power of 2"));
    }
}
