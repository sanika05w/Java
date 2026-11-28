public class SquareRootNewton
{
    public static void main(String[] args) {
        double n = 50, x = n;
        for (int i = 0; i < 20; i++) x = 0.5 * (x + n / x);
        System.out.println("sqrt(50) ~ " + x);
        System.out.println("Math.sqrt = " + Math.sqrt(n));
    }
}
