public class AbundantNumber
{
    public static void main(String[] args) {
        int n = 12;
        System.out.println(n + (sumDiv(n) > n ? " is abundant" : " is not abundant"));
    }

    static int sumDiv(int n) {
        int s = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) s += i;
        return s;
    }
}
