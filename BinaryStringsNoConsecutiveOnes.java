public class BinaryStringsNoConsecutiveOnes
{
    public static void main(String[] args) {
        System.out.println("Count for n=5 = " + count(5));
    }

    static int count(int n) {
        int a = 1, b = 2;
        if (n == 1) return 2;
        for (int i = 2; i <= n; i++) { int c = a + b; a = b; b = c; }
        return b;
    }
}
