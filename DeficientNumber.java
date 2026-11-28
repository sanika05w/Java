public class DeficientNumber
{
    public static void main(String[] args) {
        int n = 8;
        System.out.println(n + (sumDiv(n) < n ? " is deficient" : " is not deficient"));
    }

    static int sumDiv(int n) {
        int s = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) s += i;
        return s;
    }
}
