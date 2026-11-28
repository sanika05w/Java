public class AmicablePair
{
    public static void main(String[] args) {
        int a = 220, b = 284;
        boolean ok = sumDiv(a) == b && sumDiv(b) == a;
        System.out.println(a + " and " + b + (ok ? " are amicable" : " are not amicable"));
    }

    static int sumDiv(int n) {
        int s = 0;
        for (int i = 1; i < n; i++) if (n % i == 0) s += i;
        return s;
    }
}
