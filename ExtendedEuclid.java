public class ExtendedEuclid
{
    public static void main(String[] args) {
        int[] r = egcd(30, 20);
        System.out.println("gcd=" + r[0] + " x=" + r[1] + " y=" + r[2]);
    }

    static int[] egcd(int a, int b) {
        if (b == 0) return new int[]{a, 1, 0};
        int[] r = egcd(b, a % b);
        return new int[]{r[0], r[2], r[1] - (a / b) * r[2]};
    }
}
